package edu.matc.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;


/*
 * The User Entity.
 * @author JS Caughlin
 */
@Data
@Entity(name = "User")
@Table(name = "user")
public class User implements java.io.Serializable{

    @Id
    @GeneratedValue
    private int id;

    private List<UserRoles> userRole;

    private String firstName;

    private String lastName;

    private String userName;

    private String userPassword;

    private String streetAddress;

    private String cityName;

    private String stateName;

    private String userZipCode;

    private String linkToUserProfilePhoto;

    private int userPhoneNumber;
    private String userEmail;
    private LocalDate userCreatedDate;
    private LocalDate userLastUpdated;
    private LocalDate userBirthDate;


}

