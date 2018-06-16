package edu.matc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.time.LocalDate;



/**
 * This Class Represents a User.
 *
 * @author JS Caughlin
 */
@ToString
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;

    @Column(name = "last_name")
    @Getter @Setter private String lastName;

    @Column(name = "first_name")
    @Getter @Setter private String firstName;

    @Column(name = "address")
    @Getter @Setter private String streetAddress;

    @Column(name = "city")
    @Getter @Setter private String cityName;

    @Column(name = "state")
    @Getter @Setter private String stateName;

    @Column(name = "zipcode")
    @Getter @Setter private String zipCode;

    @Column(name = "areacode")
    @Getter @Setter private String areaCode;

    @Column(name = "phone")
    @Getter @Setter private String userPhoneNumber;

    @NaturalId
    @Column(name = "user_name")
    @Getter @Setter private String userName;

    @Column(name = "user_pass")
    @Getter @Setter private String userPassword;

    @Column(name = "email")
    @Getter @Setter private String userEmail;

    @Column(name = "birthday")
    @Getter @Setter private LocalDate userBirthDate;

    @Exclude
    @Column(name = "registered_date")
    @Getter @Setter private LocalDate userCreatedDate;

    @Exclude
    @Column(name = "last_updated")
    @Getter @Setter private LocalDate userLastUpdated;

    @Exclude
    @Column(name = "user_photo_link")
    @Getter @Setter private String userPhotoLink;

    /*
    @OneToMany(mappedBy = "quizAuthor", fetch = FetchType.LAZY)
    @Getter @Setter private Set<Quiz> quiz = new HashSet<>();*/

    @OneToOne(mappedBy="userName",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Getter @Setter private UserRoles userRole;


    public User(String firstName, String lastName, String userName, String userPassword, String userEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public User(String firstName, String lastName, String userName, String userPassword, String userEmail, UserRoles userRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userRole = userRole;
    }

}



