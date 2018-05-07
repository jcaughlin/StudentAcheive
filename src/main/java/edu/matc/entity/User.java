package edu.matc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import edu.matc.entity.Quiz;



import javax.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


/*
 * This Class Represents a User.
 *
 *@author JS Caughlin
 */
@ToString
@NoArgsConstructor
@Entity
@Table(name="user")
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

    @OneToOne
    @JoinColumn(name="user_name")
    @Column(name = "user_name, nullable = false, unique = true")
    @Getter @Setter private String userName;

    @Column(name = "user_pass", nullable = false)
    @Getter @Setter private String userPassword;

    @Column(name = "email", nullable = false)
    @Getter @Setter private String userEmail;

    @Column(name = "birthday")
    @Getter @Setter private LocalDate userBirthDate;

    @Column(name = "registered_date")
    @Getter @Setter private LocalDate userCreatedDate;

    @Column(name = "last_updated")
    @Getter @Setter private LocalDate userLastUpdated;

    @Column(name = "user_photo_link")
    @Getter @Setter private String user_photo_link;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @Getter @Setter private Set<Quiz> quiz = new HashSet<>();





    public User(String firstName, String lastName, String userName, String userPassword, String userEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;

    }



}

