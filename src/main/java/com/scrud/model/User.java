package com.scrud.model;

public class User {

    private String id;
    private String name;

    public User() {
        this.id = "1111";
        this.name = "Joao";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
