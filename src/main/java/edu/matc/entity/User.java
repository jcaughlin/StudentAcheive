package edu.matc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;



/*
 * The User Entity.
 * @author JS Caughlin
 */
@ToString
@Entity(name = "User")
@Table(name = "user")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;

  /*  @Column(name = "user_roles")
    @Getter @Setter private List<UserRoles> userRole;*/

    @Column(name = "first_name")
    @Getter @Setter private String firstName;

    @Column(name = "last_name")
    @Getter @Setter private String lastName;

    @Column(name = "user_name")
    @Getter @Setter private String userName;

    @Column(name = "user_pass")
    @Getter @Setter private String userPassword;

    @Column(name = "address")
    @Getter @Setter private String streetAddress;

    @Column(name = "city")
    @Getter @Setter private String cityName;

    @Column(name = "state")
    @Getter @Setter private String stateName;

    @Column(name = "zipcode")
    @Getter @Setter private Integer zipCode;

    @Column(name = "areacode")
    @Getter @Setter private String areaCode;

    @Column(name = "phone")
    @Getter @Setter private String userPhoneNumber;

    @Column(name = "email")
    @Getter @Setter private String userEmail;

    @Column(name = "registered_date")
    @Getter @Setter private LocalDate userCreatedDate;

    @Column(name = "last_updated")
    @Getter @Setter private LocalDate userLastUpdated;

    @Column(name = "birthday")
    @Getter @Setter private LocalDate userBirthDate;

    /*@Column(name = "user_photo_link")
    @Getter @Setter private String linkToUserProfilePhoto;*/

    public User() {

    }

    public User(String firstName, String lastName, String userName, String userPassword, String userEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }


}

