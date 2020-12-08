/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.Chuong;
import com.utils.JDBCHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class chuongDAO {

    String insert_sql = "INSERT INTO dbo.chuong( truyen_id, filePDF, name )VALUES(?, ?, ? )";
    String update_sql = "UPDATE dbo.chuong SET truyen_id = ?, name = ?,filePDF =? where id = ? ";
    String delete_sql = "DELETE dbo.chuong WHERE id = ?";

    public void insert(Chuong model) throws SQLException {
        JDBCHelper.update(insert_sql, model.gettruyen(), model.getFilePDF(), model.getTenChuong());
    }

    public void update(Chuong model) throws SQLException {
        JDBCHelper.update(update_sql, model.gettruyen(), model.getTenChuong(), model.getFilePDF(), model.getId());
    }

    public void delete(Chuong model) throws SQLException {
        JDBCHelper.update(delete_sql, model.getId());
    }

    public List<Chuong> selectAll() {
        String sql = "select * from chuong";
        return this.selectBySQL(sql);
    }

    public Chuong selectByID(int id) {
        String sql = "select * from chuong where id = ?";
        List<Chuong> list = selectBySQL(sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<Chuong> selectBySQL(String sql, Object... args) {
        List<Chuong> list = new ArrayList<>();
        try {
            
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Chuong model = new Chuong();
                model.setId(rs.getInt("id"));
                model.settruyen(rs.getInt("truyen_id"));
                model.setFilePDF(rs.getString("filePDF"));
                model.setTenChuong(rs.getString("name"));
                list.add(model);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
    public List<Chuong> selectByTID(int id){
        String sql = "select * from chuong where truyen_id = ?";
        List<Chuong> list = selectBySQL(sql, id);        
        return list;
    }
    public Chuong selectByName(String name){
        String sql = "select * from chuong where name = ?";
        List<Chuong> list = selectBySQL(sql, name);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
