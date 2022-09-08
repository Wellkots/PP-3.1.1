package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.dao.UserDao;
import org.example.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }


}
