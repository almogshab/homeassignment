package com.datanet.homeassignment.model;
public class User {
    private String name;

    // Constructors
    public User(String name) {
        this.name = name;
    }

        public User() {
    }
    

    // Getters and Setters
    public String getName() { return name; }
 
    public void setName(String name) { this.name = name; }
}
