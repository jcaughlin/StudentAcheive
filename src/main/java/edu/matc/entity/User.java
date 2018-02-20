package edu.matc.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


/*
 * The User Entity.
 * @author JS Caughlin
 */

@NoArgsConstructor
@ToString
@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native",strategy="native")
    @Getter @Setter private int id;
    @Getter @Setter private List<UserRoles> userRole;
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private String userName;
    @Getter @Setter private String userPassword;
    @Getter @Setter private String streetAddress;
    @Getter @Setter private String cityName;
    @Getter @Setter private String stateName;
    @Getter @Setter private String userZipCode;
    @Getter @Setter private int userPhoneNumber;
    @Getter @Setter private String userEmail;
    @Getter @Setter private LocalDate userCreatedDate;
    @Getter @Setter private LocalDate userLastUpdated;
    @Getter @Setter private LocalDate userBirthDate;

    // private String linkToUserProfilePhoto;


}

