/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.theLoai;
import com.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class theLoaiDAO {
    String insert_sql = "INSERT INTO dbo.theLoai (name) VALUES  (?)";
    String update_sql = "UPDATE dbo.theLoai SET name = ? WHERE id = ?";
    String delete_sql = "DELETE FROM dbo.theLoai WHERE id = ?";
    public void insert(theLoai tL) throws SQLException{
        JDBCHelper.update(insert_sql,tL.getTenTL());
    }
    public void update(theLoai tL){
        JDBCHelper.update(update_sql, tL.getTenTL(),tL.getId());
    }
    public void delete(theLoai tL){
        JDBCHelper.update(delete_sql, tL.getId());
    }
    public theLoai selectByID(int id) throws SQLException{
        String sql = "select * from theLoai where id = ?";
        List<theLoai> list = this.selectBySql(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
        
    }
    public List<theLoai> selectAll() throws SQLException{
        String sql = "select * from theLoai";
        return this.selectBySql(sql);
    }
    public List<theLoai> selectBySql(String sql,Object ...args) throws SQLException{
        List<theLoai> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()){
                theLoai tL = new theLoai();
                tL.setId(rs.getInt("id"));
                tL.setTenTL(rs.getString("name"));              
                list.add(tL);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
        }
        return list;
    }
    public theLoai getIDByName(Object name) throws SQLException{
        String sql = "select * from theLoai where name = ?";
        List<theLoai> tL = selectBySql(sql, name);
        if(tL.isEmpty()){
            return null;
        }
        return tL.get(0);
    }
}
