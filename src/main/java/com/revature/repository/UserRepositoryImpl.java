package com.revature.repository;

import com.revature.model.User;
import com.revature.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private static Logger logger = Logger.getLogger(HibernateUtil.class);

    @Override
    public void save(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            session.save(user);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            logger.warn("Exception creating a new user", e);
        }
    }

    @Override
    public void update(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            session.load(User.class,user.getUserId());
            session.update(user);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            logger.warn("Exception updating user", e);
        }
    }

    @Override
    public void delete(int id) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            User user = session.get(User.class, id);
            if (user != null) {
                session.delete(user);
                System.out.println("user is deleted");
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            logger.warn("Exception deleting customer", e);
        }
    }

    @Override
    public User getById(int id) {

        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            user = session.get(User.class, id);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            logger.warn("Exception retrieving user", e);
        }
        return user;
    }

    @Override
    public List<User> getAll() {
        Transaction transaction = null;
        List <User> users = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            users = session.createQuery("FROM User").getResultList();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            logger.warn("Exception getting all users", e);
        }
        return users;
    }

    public User authenticate(String username, String password) {
        User user = null;
        try(Session session = HibernateUtil.getSession()) {

            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM User u WHERE u.username=:username AND u.password=:password");
            query.setParameter("username", username);
            query.setParameter("password", password);

            user = (User) query.uniqueResult();

            transaction.commit();

            return user;

        } catch (IOException e) {
            logger.warn("Exception authenticating user", e);
        }

        return null;
    }

}
