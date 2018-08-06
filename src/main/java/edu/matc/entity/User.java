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
import java.util.HashSet;
import java.util.Set;


/**
 * This Class Represents a User.
 *
 * @author JS Caughlin
 */
@Entity
@NoArgsConstructor
@ToString
@Table(name = "user")
public class User implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;

    @Column(name = "last_name")
    @Getter @Setter private String lastName;

    @Column(name = "first_name")
    @Getter @Setter private String firstName;

    @NaturalId
    @Column(name = "user_name")
    @Getter @Setter private String userName;

    @Column(name = "user_pass")
    @Getter @Setter private String userPassword;

    @Column(name = "user_email")
    @Getter @Setter private String userEmail;

    @Column(name = "birthday")
    @Getter @Setter private LocalDate userBirthDate;

    @Exclude
    @Column(name = "registered_date")
    @Getter @Setter private LocalDate userCreatedDate;

    @Exclude
    @Column(name = "last_updated")
    @Getter @Setter private LocalDate userLastUpdated;

    @Column(name = "user_photo_link")
    @Getter @Setter private String userPhotoLink;

    @OneToOne(mappedBy = "user",cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
    @Getter @Setter private UserRole userRole;

    @ManyToMany(cascade = CascadeType.ALL)
    @Getter @Setter private Set<Address> addresses = new HashSet<Address>();

     /*
    @OneToMany(mappedBy = "quizAuthor", fetch = FetchType.LAZY)
    @Getter @Setter private Set<Quiz> quiz = new HashSet<>();*/

     public void addAddress(Address address) {
         this.addresses.add(address);
         address.getUsers().add(this);
     }

     public void removeAddress(Address address) {
         this.addresses.remove(address);
         address.getUsers().remove(this);
     }

    public User(String firstName, String lastName, String userName, String userPassword, String userEmail, UserRole userRole, Set<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userRole = userRole;
        this.addresses = addresses;

    }

    public User(String firstName, String lastName, String userName, String userPassword, String userEmail, Set<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.addresses = addresses;
    }

    public User(String firstName, String lastName, String userName, String userPassword, String userEmail, UserRole userRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userRole = userRole;

    }

    public User(String firstName, String lastName, String userName, String userPassword, String userEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;

    }


}



