package com.pp_3_1_1_springboot.service;

import com.pp_3_1_1_springboot.model.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUserById(int id);
}
