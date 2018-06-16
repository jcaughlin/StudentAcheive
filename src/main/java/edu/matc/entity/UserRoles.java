package edu.matc.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NaturalId;

/**
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

    @Enumerated(EnumType.STRING)
    @Column(name="role_name", nullable = false, columnDefinition = "ENUM PENDING")
    @Getter @Setter private RoleName roleName;

    @NaturalId
    @Column(name = "user_name")
    @Getter @Setter private String userName;

    @OneToOne
    @JoinColumn(name="user_name")
    @Getter @Setter private User user;


=======
    @Column(name="user_name")
    @Getter @Setter private String userName;

>>>>>>> AddressEntityRefactor
    public UserRoles(String userName, RoleName roleName){
        this.userName = userName;
        this.roleName = roleName;
    }

}


