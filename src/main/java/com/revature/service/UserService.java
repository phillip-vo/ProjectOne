package com.revature.service;

import com.revature.model.User;
import com.revature.repository.UserRepository;
import com.revature.repository.UserRepositoryImpl;
import com.revature.util.HibernateUtil;
import org.apache.log4j.Logger;

import java.util.List;

public class UserService {

    private static Logger logger = Logger.getLogger(HibernateUtil.class);

    UserRepository userRepository;

    public UserService() {
        userRepository = new UserRepositoryImpl();
    }

    public void saveUser(User user) {
        if(userRepository.getById(user.getUserId()) == null) {
            userRepository.save(user);
            logger.info("saveUser: saving new user");
        }
    }

    public void updateUser(User user) {
        if(userRepository.getById(user.getUserId()) != null) {
            userRepository.update(user);
            logger.info("updateUser: updating user");
        }
    }

    public User getUserById(int id) {
        logger.info("getUserById: retrieving user");
        return userRepository.getById(id);
    }

    public void deleteUser(int id) {
        if(userRepository.getById(id) != null) {
            userRepository.delete(id);
            logger.info("deleteUser: deleting user");
        }
    }

    public List<User> getAllUser() {
        logger.info("getAllUser: getting all users");
        return userRepository.getAll();
    }

    public User authenticateUser(String username, String password) {
        logger.info("authenticateUser: authenticating user");
        return userRepository.authenticate(username, password);
    }
}
