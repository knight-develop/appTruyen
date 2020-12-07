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
public class theLoai {
    private int id;
    private String tenTL;

    public theLoai() {
    }

    public theLoai(int id, String tenTL) {
        this.id = id;
        this.tenTL = tenTL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    @Override
    public String toString() {
        return this.tenTL; //To change body of generated methods, choose Tools | Templates.
    }
    
}
