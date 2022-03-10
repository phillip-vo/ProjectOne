package com.revature.repository;

import com.revature.model.User;

public interface UserRepository extends Repository<User> {
    User authenticate(String username, String password);
}
