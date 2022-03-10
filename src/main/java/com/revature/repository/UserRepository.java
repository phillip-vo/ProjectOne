package com.revature.repository;

import com.revature.model.User;
import com.revature.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.List;

public class UserRepository {

    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.load(User.class,user.getUserId());
            session.update(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a user object
            User user = session.get(User.class, id);
            if (user != null) {
                session.delete(user);
                System.out.println("user is deleted");
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public User getUser(int id) {

        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = session.get(User.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return user;
    }

    public List<User> getAllUser() {

        Transaction transaction = null;
        List < User > listOfUser = null;
        try (Session session = HibernateUtil.getSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object

            listOfUser = session.createQuery("from User").getResultList();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfUser;
    }

    public boolean authenticateUser(String username, String password) {
        try(Session session = HibernateUtil.getSession()) {
            // Start a transaction
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM User u WHERE u.username=:username AND u.password=:password");
            query.setParameter("username", username);
            query.setParameter("password", password);

            if (query.uniqueResult() != null) {
                return true;
            }

            // Commit transaction
            transaction.commit();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

}
