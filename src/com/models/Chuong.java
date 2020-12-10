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
public class Chuong {
    private int id, truyen;
    private String tenChuong, filePDF;

    public Chuong() {
    }

    public Chuong(int id, String tenChuong, int truyen, String filePDF) {
        this.id = id;
        this.tenChuong = tenChuong;
        this.truyen = truyen;
        this.filePDF = filePDF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getTenChuong() {
        return tenChuong;
    }

    public void setTenChuong(String tenChuong) {
        this.tenChuong = tenChuong;
    }

    public int gettruyen() {
        return truyen;
    }

    public void settruyen(int tenTruyen) {
        this.truyen = tenTruyen;
    }

    public String getFilePDF() {
        return filePDF;
    }

    public void setFilePDF(String filePDF) {
        this.filePDF = filePDF;
    }

    @Override
    public String toString() {
        return this.tenChuong;
    }
    
}
