package com.revature.util;

import com.revature.model.Gundam;
import com.revature.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.io.IOException;
import java.util.Properties;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static Session getSession() throws IOException{
        if(sessionFactory == null) {

            Configuration configuration = new Configuration();

            ClassLoader loader = Thread.currentThread().getContextClassLoader();

            Properties props = new Properties();
            props.load(loader.getResourceAsStream("hibernate.properties"));

            configuration.setProperties(props);

            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Gundam.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }

        return sessionFactory.openSession();
    }
}
