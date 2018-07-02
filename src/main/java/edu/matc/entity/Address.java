package edu.matc.entity;

import edu.matc.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



/**
 * This Class Represents a User.
 *
 * @author JS Caughlin
 */
@ToString
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;

    @Column(name = "street_address")
    @Getter @Setter private String streetAddress;

    @Column(name = "unit")
    @Getter @Setter private String unitNumber;

    @Column(name = "city")
    @Getter @Setter private String cityName;

    @Column(name = "state")
    @Getter @Setter private String stateName;

    @Column(name = "zipcode")
    @Getter @Setter private String zipCode;

    @Column(name = "areacode")
    @Getter @Setter private String areaCode;

    @Column(name = "phone_number")
    @Getter @Setter private String userPhoneNumber;

    @ManyToMany
    @JoinTable(name = "user_address",
            joinColumns = {@JoinColumn(name = "fk_address")},
            inverseJoinColumns = {@JoinColumn(name = "fk_author")})
    @Getter @Setter private List<User> user = new ArrayList<User>();



    public Address(String streetAddress, String cityName, String stateName, String zipCode){
        this.streetAddress = streetAddress;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;

    };


}



