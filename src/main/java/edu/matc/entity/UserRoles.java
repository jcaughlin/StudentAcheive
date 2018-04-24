package edu.matc.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This Class represents the Security Access Roles for the Users.
 *
 *@author jscaughlin
*/
@ToString
@NoArgsConstructor
@Entity
@Table(name="user_roles")
public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;


    @Getter @Setter private RoleName roleName;

    @Getter @Setter private User user;

    @Getter @Setter private String userName;

    public UserRoles(String userName, RoleName roleName){
        this.userName = userName;
        this.roleName = roleName;

    }
}


