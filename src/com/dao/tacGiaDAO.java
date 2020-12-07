/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.tacGia;
import com.models.theLoai;
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
public class tacGiaDAO {
    String insert_sql = "insert into tacGia(name,email) values(?,?)";
    String update_sql = "UPDATE dbo.tacGia SET name = ?, email = ? WHERE id = ?";
    String delete_sql = "DELETE FROM dbo.tacGia WHERE id = ?";
    public void insert(tacGia tG) throws SQLException{
        JDBCHelper.update(insert_sql,tG.getName(), tG.getEmail());
    }
    public void update(tacGia tG) throws SQLException{
        JDBCHelper.update(update_sql,tG.getName(),tG.getEmail(), tG.getId());
    }
    public void delete(tacGia tG) throws SQLException{
        JDBCHelper.update(delete_sql, tG.getId());
    }
    public List<tacGia> selectAll(){
        String sql = "select * from tacGia";
        return this.selectBySQL(sql);
    }
    public tacGia selectByID(int id){
        String sql = "select * from tacGia where id = ?";
        List<tacGia> list = selectBySQL(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    public List<tacGia> selectBySQL(String sql, Object... arg){
        List<tacGia> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, arg);
            while(rs.next()){
                tacGia tG = new tacGia();
                tG.setId(rs.getInt("id"));
                tG.setName(rs.getString("name"));
                tG.setEmail(rs.getString("email"));
                list.add(tG);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
    public tacGia selectTGByIDT(int id){
        String sql = "SELECT name FROM dbo.tacGia WHERE id = ? ";
        List<tacGia> list = selectBySQL(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
