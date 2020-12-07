/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import com.models.Truyen;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author admin
 */
public class Renderer extends DefaultListCellRenderer implements ListCellRenderer<Object>{

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Truyen tr = (Truyen) value;
        setText(tr.getName());
        setIcon(tr.getImage());
        if(isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        }
        else{
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(true);
        setFont(list.getFont());
        return this;
    }
    
}
