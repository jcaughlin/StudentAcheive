package edu.matc.persistence;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The type Generic dao.
 *
 * @param <T> the type parameter
 */
public class GenericDao<T> {

    private Class<T> type;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Instantiates a new Generic dao.
     *
     * @param type the class type
     */
    public GenericDao(Class<T> type) {
        this.type = type;
    }

    /**
     * Presists an entity by inserting it into the database.
     *
     * @param entity the entity
     * @return the int id
     */
    public int insert(T entity) {
        Session session = getSession();
        Transaction transaction = null;
        int id = 0;
        try {

            transaction = session.beginTransaction();
            id = (int) session.save(entity);
            transaction.commit();


        } catch (Exception exception) {
            if (transaction != null) transaction.rollback();
            logger.info("There was an exception persisting" + exception);

        } finally {
            session.close();
        }
        return id;
    }


    /**
     * Returns an entitu with the id provided as an argument.
     *
     * @param <T> the type parameter
     * @param id  the id
     * @return the by id
     */
    public <T> T getById(int id) {

        Session session = getSession();

        T entity = (T) session.get(type, id);
        session.close();
        return entity;
    }

    /**
     * Returns a list of all entities of the class type provided.
     *
     * @return the all
     */
    public List<T> getAll() {

        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        List<T> resultList = session.createQuery(query).getResultList();
        session.close();

        return resultList;
    }


    /**
     * Returns a List of Entities with properties that are equal to the parameters provided.
     *
     * @param propertyName the property name
     * @param object       the object
     * @return the by property equal
     */
    public List<T> getByPropertyEqual(String propertyName, Object object) {
        Session session = getSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        query.select(root).where(builder.equal(root.get(propertyName), object));
        List<T> list = session.createQuery(query).getResultList();

        session.close();
        return list;
    }


    /**
     * Returns a List of entities that have a property using a Like search criteria.
     *
     * @param propertyName the property name
     * @param value        the value
     * @return the by property like
     */
    public List<T> getByPropertyLike(String propertyName, String value) {
        Session session = getSession();

        logger.debug("Searching for entity with {} = {}", propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<T> list = session.createQuery(query).getResultList();
        session.close();
        return list;
    }

    /**
     * Saves or Updates the entity to the database.
     *
     * @param entity the entity
     */
    public void saveOrUpdate(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
    }

    /**
     * Delete.
     *
     * @param entity the entity
     */
    public void delete(T entity) {

        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }


    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }
}
