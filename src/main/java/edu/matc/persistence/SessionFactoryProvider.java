package edu.matc.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
/**
 * static {
 * try {
 * StandardServiceRegistry standardRegistry =
 * new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
 * Metadata metaData =
 * new MetadataSources(standardRegistry).getMetadataBuilder().build();
 * sessionFactory = metaData.getSessionFactoryBuilder().build();
 * } catch (Throwable th) {
 * System.err.println("Enitial SessionFactory creation failed" + th);
 * throw new ExceptionInInitializerError(th);
 * }
 * }
 */

/**
 * This file provides a SessionFactory for use with DAOs using Hibernate
 *
 * @author paulawaite
 * @version 2.0 1/27/18.
 */
public class SessionFactoryProvider {

    private static SessionFactory sessionFactory;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Create session factory.
     */
    public static void createSessionFactory() {
        try {
            StandardServiceRegistry standardRegistry =
                    new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            Metadata metaData =
                    new MetadataSources(standardRegistry).getMetadataBuilder().build();
            sessionFactory = metaData.getSessionFactoryBuilder().build();
        } catch (Throwable throwable) {

            throw new ExceptionInInitializerError(throwable);
        }
    }

    /// private static SessionFactory sessionFactory;

    /**
     * private constructor prevents instantiating this class anywhere else
     */

    /*private SessionFactoryProvider() {

    }
    /**
     * Create session factory.
     *//**
     public static void createSessionFactory() {

     StandardServiceRegistry standardRegistry =
     new StandardServiceRegistryBuilder().configure().build();
     Metadata metaData =
     new MetadataSources(standardRegistry).getMetadataBuilder().build();
     sessionFactory = metaData.getSessionFactoryBuilder().build();
     }*/


    /**
     * Gets session factory.
     *
     * @return the session factory
     */
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            createSessionFactory();
        }
        return sessionFactory;

    }

}