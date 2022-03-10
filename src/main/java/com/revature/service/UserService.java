package com.revature.service;

import com.revature.model.User;
import com.revature.repository.UserRepository;
import com.revature.repository.UserRepositoryImpl;

import java.util.List;

public class UserService {
    UserRepository userRepository;

    public UserService() {
        userRepository = new UserRepositoryImpl();
    }

    public void saveUser(User user) {
        if(userRepository.getById(user.getUserId()) == null) {
            userRepository.save(user);
        }
    }

    public void updateUser(User user) {
        if(userRepository.getById(user.getUserId()) != null) {
            userRepository.update(user);
        }
    }

    public User getUserById(int id) {
        return userRepository.getById(id);
    }

    public void deleteUser(int id) {
        if(userRepository.getById(id) != null) {
            userRepository.delete(id);
        }
    }

    public List<User> getAllUser() {
        return userRepository.getAll();
    }

    public User authenticateUser(String username, String password) {
        return userRepository.authenticate(username, password);
    }
}
