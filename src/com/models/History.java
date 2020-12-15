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
public class History {
    private int id, truyen_id,user_id;

    public History() {
    }

    public History(int id, int truyen_id, int user_id) {
        this.id = id;
        this.truyen_id = truyen_id;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTruyen_id() {
        return truyen_id;
    }

    public void setTruyen_id(int truyen_id) {
        this.truyen_id = truyen_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
}
