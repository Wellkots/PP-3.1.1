package org.example.dao;

import org.example.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    User getById(int id);
    void delete(int id);
    void update(User user);




}
