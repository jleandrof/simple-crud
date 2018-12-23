package com.scrud.services;

import com.scrud.model.User;
import com.scrud.repository.UserDAO;
import java.util.Map;

/**
 * Author Leandro Silva (22-12-2018)
 */
public class UserService {

    private UserDAO userDAO = new UserDAO();

    public Map<String, User> getAllUsers() {
        return userDAO.getUsers();
    }

    public User createUser(User user) {
        return userDAO.createUser(user);
    }

    public User updateUser(String id, User user) {
        return userDAO.updateUser(id, user);
    }

    public User remove(String id) {
        return userDAO.removeUser(id);
    }
}
