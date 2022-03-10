package com.revature.repository;

import com.revature.model.Gundam;
import com.revature.model.User;
import com.revature.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.List;

public class GundamRepositoryImpl implements GundamRepository {

    @Override
    public void save(Gundam gundam) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            session.save(gundam);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void update(Gundam gundam) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            session.load(Gundam.class, gundam.getGundamId());
            session.update(gundam);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            Gundam gundam = session.get(Gundam.class, id);
            if (gundam != null) {
                session.delete(gundam);
                System.out.println("user is deleted");
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Gundam getById(int id) {

        Transaction transaction = null;
        Gundam gundam = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            gundam = session.get(Gundam.class, id);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return gundam;
    }

    @Override
    public List<Gundam> getAll() {

        Transaction transaction = null;
        List <Gundam> gundams = null;
        try (Session session = HibernateUtil.getSession()) {

            transaction = session.beginTransaction();

            gundams = session.createQuery("FROM Gundam").getResultList();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return gundams;
    }

}
