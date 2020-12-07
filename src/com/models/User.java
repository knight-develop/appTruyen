/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author admin
 */
public class User {
    private String user,pass;
    private int id;
    private boolean role;

    public User() {
    }

    public User(int id, String user, String pass, String email, boolean role) {
        this.user = user;
        this.pass = pass;
        this.role = role;
    }

    public User(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
    
}
