/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.Truyen;
import com.models.tacGia;
import com.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class truyenDAO {
    String insert_sql = "INSERT INTO dbo.truyenTranh( tacGia_id ,name , trangThai ,hinh ,gioiThieu)\n" +
                        "VALUES  (?, ?, ?, ? ,?)";
    String update_sql = "UPDATE dbo.truyenTranh SET tacGia_id = ?, name = ?, "
            + "trangThai = ?, hinh = ?, gioiThieu = ? WHERE id = ? ";
    String delete_sql = "DELETE dbo.truyenTranh WHERE id = ?";
    public void insert(Truyen model) throws SQLException{
        JDBCHelper.update(insert_sql, model.getTacGia(), model.getName(),model.getTrangThai(), model.getHinh(), model.getGioiThieu());
    }
    public void update(Truyen model) throws SQLException{
        JDBCHelper.update(update_sql, model.getTacGia(), model.getName(),model.getTrangThai(), model.getHinh(), model.getGioiThieu(), model.getId());
    }
    public void delete(Truyen model) throws SQLException{
        JDBCHelper.update(delete_sql,model.getId());
    }
    public List<Truyen> selectAll(){
        String sql = "select * from truyenTranh";
        return this.selectBySQL(sql);
    }
    public Truyen selectByID(int id){
        String sql = "select * from truyenTranh where id = ?";
        List<Truyen> list = selectBySQL(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    public List<Truyen> selectBySQL(String sql, Object... args){
        List<Truyen> list = new ArrayList<>();
        try {
            
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()){
                Truyen model = new Truyen();
                model.setId(rs.getInt("id"));
                model.setTacGia(rs.getInt("tacGia_id"));
                model.setHinh(rs.getString("hinh"));
                model.setGioiThieu(rs.getString("gioiThieu"));
                model.setName(rs.getString("Name"));
                model.setTrangThai(rs.getBoolean("trangThai"));
                list.add(model);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
    public Truyen selectByName(String name){
        
        String sql = "select * from truyenTranh where Name = ?";
        List<Truyen> list = selectBySQL(sql, name);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
