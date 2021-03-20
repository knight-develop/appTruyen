/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.History;
import com.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class HISDAO {
    String insert_sql = "insert into lichsu(users_id, truyen_id) values(?,?)";
    String delete_sql = "DELETE FROM dbo.lichSu WHERE truyen_id = ?";
    public void insert(History hs){
        JDBCHelper.update(insert_sql, hs.getUser_id(),hs.getTruyen_id());
    }
    
    public void delete(History hs){
        JDBCHelper.update(delete_sql, hs.getTruyen_id());
    }
    public History selectByID(String id) throws SQLException{
        String sql = "select * from lichSu where truyen_id = ?";
        List<History> list = this.selectBySql(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);       
    }
    public List<History> selectAll() throws SQLException{
        String sql = "select * from lichSu";
        return this.selectBySql(sql);
    }
    public List<History> selectBySql(String sql,Object ...args) throws SQLException{
        List<History> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()){
                History us = new History();
                us.setId(rs.getInt("id"));
                us.setTruyen_id(rs.getInt("truyen_id"));
                us.setUser_id(rs.getInt("users_id"));
                list.add(us);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
        }
        return list;
    }
}
