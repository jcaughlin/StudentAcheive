package edu.matc.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class UserRoles {

    @Getter @Setter private int userRoleId;
    @Getter @Setter private RoleName roleName;
    @Getter @Setter private User user;
    @Getter @Setter private String userName;
}
