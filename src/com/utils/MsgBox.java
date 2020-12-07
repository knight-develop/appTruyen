/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class MsgBox {
    public static void alert(Component parent,String message){
        JOptionPane.showMessageDialog(parent, message,"Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
        
    }
    public static boolean comfirm(Component parent,String message){
        int result = JOptionPane.showConfirmDialog(parent, message,"Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    public static String prompt(Component parent,String message){
        return JOptionPane.showInputDialog(parent,message,"Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
    }
}
