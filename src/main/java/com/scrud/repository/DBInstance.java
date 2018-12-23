package com.scrud.repository;

import com.scrud.model.User;
import java.util.HashMap;
import java.util.Map;

/**
 * Author Leandro Silva (22-12-2018)
 *
 * This class emulates an instance of a database.
 */
public class DBInstance {

    private HashMap<String, User> db;
    private static DBInstance dbInstance;

    private DBInstance(){

        this.db = new HashMap<String, User>();
        User user = new User();
        db.put(user.getId(), user);
    }

    public static synchronized DBInstance getInstance(){
        if(dbInstance == null){
            dbInstance = new DBInstance();
        }
        return dbInstance;
    }

    public Map<String, User> getDB() {
        return db;
    }

    public void insert(User user) {
        db.put(user.getId(), user);
    }

    public User update(String id, User user) {
        return db.put(id, user);
    }

    public User delete(String id) {
        return db.remove(id);
    }
}