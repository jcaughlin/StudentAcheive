package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * The type User dao.
 * 
 */

public class UserDao {

    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
    private final Logger log = LogManager.getLogger(this.getClass());


    /**
     * Insert User object into Database.
     *
     * @param user the user
     * @return the int
     */
    public int insert(User user) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(user);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Get User object by id.
     *
     * @param id the id
     * @return the user
     */
    public User getById(int id){

        Session session = sessionFactory.openSession();
        User user = session.get(User.class, id);
        session.close();

        return user;
    }

    /**
     * Gets all Users.
     *
     * @return the all
     */
    public List<User> getAllUsers() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        List<User> userList = session.createQuery(query).getResultList();
        session.close();

        return userList;
    }

    /**
     * Save or updates User Object.
     *
     * @param user the user
     */
    public void saveOrUpdate(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
    }

    /**
     * Gets User List by last name.
     *
     * @param lastName the last name
     * @return the users by last name
     */
    public List<User> getUsersByLastName(String lastName) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery query = builder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        Expression<String> propertyPath = root.get("lastName");
        query.where(builder.like(propertyPath, "%" + lastName + "%"));
        List<User> userList = session.createQuery(query).getResultList();

        session.close();

        return userList;
    }

    /**
     * Returns a List of Users with where a value is equal to a property.
     *
     * @param propertyValue the criteria that is being uses for the search.
     * @param  propertyName the name of the property that is being searched.
     * @return the users by last name
     */
    public List<User> getUserByProperty(String propertyValue, String propertyName) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery query = builder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        Expression<String> propertyPath = root.get(propertyName);
        query.where(builder.equal(propertyPath, propertyValue));
        List<User> userList = session.createQuery(query).getResultList();

        session.close();

        return userList;
    }

    /**
     * Deletes a User from Database.
     *
     * @param user the user
     */
    public void delete(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();

        session.close();
    }

}
