package org.example.service;

import org.example.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void update(User user);
    void addUser(User user);
    User getById(int id);
    void delete(int id);
}
