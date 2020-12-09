/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.chiTietTruyen;
import com.utils.JDBCHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class chiTietDAO {
    String insert_sql = "INSERT INTO dbo.chiTietTruyen( truyen_id ,theLoai_id)\n" +
                        "VALUES  (?, ?)";
    String update_sql = "UPDATE dbo.chiTietTruyen SET truyen_id =?, theLoai_id = ? where id = ?  ";
    String delete_sql = "DELETE dbo.chiTietTruyen WHERE id = ?";
    public void insert(chiTietTruyen model) throws SQLException{
        JDBCHelper.update(insert_sql, model.getTruyen(), model.getTheLoai());
    }
    public void update(chiTietTruyen model) throws SQLException{
        JDBCHelper.update(insert_sql, model.getTruyen(), model.getTheLoai(), model.getId());
    }
    public void delete(chiTietTruyen model) throws SQLException{
        JDBCHelper.update(insert_sql,model.getId());
    }
    public List<chiTietTruyen> selectAll(){
        String sql = "select * from chiTietTruyen";
        return this.selectBySQL(sql);
    }
    public chiTietTruyen selectByID(int id){
        String sql = "select * from chiTietTruyen where id = ?";
        List<chiTietTruyen> list = selectBySQL(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    public List<chiTietTruyen> selectBySQL(String sql, Object... args){
        List<chiTietTruyen> list = new ArrayList<>();
        try {
            
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()){
                chiTietTruyen model = new chiTietTruyen();
                model.setId(rs.getInt("id"));
                model.setTheLoai(rs.getInt("theLoai_id"));
                model.setTruyen(rs.getInt("truyen_id"));
                list.add(model);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
    public List<chiTietTruyen> selectListByID(int id){
        String sql = "select * from chiTietTruyen where truyen_id = ?";
        List<chiTietTruyen> list = selectBySQL(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
    public List<chiTietTruyen> selectListByIDTL(int id){
        String sql = "select * from chiTietTruyen where theLoai_id = ?";
        List<chiTietTruyen> list = selectBySQL(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
