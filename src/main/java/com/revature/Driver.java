package com.revature;

import com.revature.model.User;
import com.revature.repository.UserRepository;
import com.revature.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;

public class Driver {
    public static void main(String[] args) throws IOException {

        UserRepository ur = new UserRepository();

        List<User> users = ur.getAllUser();

        for(User u : users) {
            System.out.println(u);
        }


    }
}
