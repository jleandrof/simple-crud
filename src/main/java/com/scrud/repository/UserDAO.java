package com.scrud.repository;

import com.scrud.model.User;
import java.util.Map;

/**
 * Author Leandro Silva (22-12-2018)
 */
public class UserDAO {

    private DBInstance dbInstance;

    public UserDAO() {

        dbInstance = DBInstance.getInstance();
    }

    public Map<String, User> getUsers() {

        return dbInstance.getDB();
    }

    public User createUser(User user) {
        dbInstance.insert(user);
        return user;
    }

    public User updateUser(String id, User user) {
        return dbInstance.update(id, user);
    }

    public User removeUser(String id) {
        return dbInstance.delete(id);
    }
}
