package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.entity.UserRoles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

import static edu.matc.entity.RoleName.PENDING;

public class UserRolesDao {

    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
    private final Logger log = LogManager.getLogger(this.getClass());


    /**
     * Gets all users with PENDING role.
     *
     * @return pendingUsersList.
     */
    public List<User> getAllPendingUsers() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery query = builder.createQuery(UserRoles.class);
        Root<User> root = query.from(UserRoles.class);
        Expression<String> propertyPath = root.get("roleName");
        query.where(builder.like(propertyPath, "%" + PENDING + "%"));
        List<User> pendingUsersList = session.createQuery(query).getResultList();


        return pendingUsersList;

    }
}
