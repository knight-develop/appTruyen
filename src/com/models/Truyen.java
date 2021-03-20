/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import javax.swing.Icon;

/**
 *
 * @author admin
 */
public class Truyen {
    private int id,tacGia,views;
    private String name, gioiThieu, hinh;
    private boolean trangThai;
    private Icon image;
    public Truyen() {
    }

    public Truyen(int views, String name, Icon image) {
        this.views = views;
        this.name = name;
        this.image = image;
    }



    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
    
    public Truyen(String name, Icon image) {
        this.name = name;
        this.image = image;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }
    
    public Truyen(int id, String name, int tacGia, boolean trangThai, String gioiThieu, String hinh) {
        this.id = id;
        this.name = name;
        this.tacGia = tacGia;
        this.trangThai = trangThai;
        this.gioiThieu = gioiThieu;
        this.hinh = hinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTacGia() {
        return tacGia;
    }

    public void setTacGia(int tacGia) {
        this.tacGia = tacGia;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return this.name; //To change body of generated methods, choose Tools | Templates.
    }
    
}
