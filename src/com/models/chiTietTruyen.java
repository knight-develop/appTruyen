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
public class chiTietTruyen {
    private int id;
    private int theLoai, Truyen;

    public chiTietTruyen() {
    }

    public chiTietTruyen(int id, int theLoai, int Truyen) {
        this.id = id;
        this.theLoai = theLoai;
        this.Truyen = Truyen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public int getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(int theLoai) {
        this.theLoai = theLoai;
    }

    public int getTruyen() {
        return Truyen;
    }

    public void setTruyen(int Truyen) {
        this.Truyen = Truyen;
    }
    
}
