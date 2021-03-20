package com.dao;


import com.models.User;
import com.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class UserDAO {
    String insert_sql = "INSERT into dbo.users(username, passwords) VALUES(?,?)";
    String update_sql = "UPDATE dbo.users SET password = ? WHERE username = ?";
    String delete_sql = "DELETE FROM dbo.users WHERE id = ?";
    public void insert(User us){
        JDBCHelper.update(insert_sql,us.getUser(),us.getPass());
    }
    public void update(User us){
        JDBCHelper.update(update_sql, us.getPass(),us.getUser());
    }
    public void delete(User us){
        JDBCHelper.update(delete_sql, us.getId());
    }
    public User selectByID(String id) throws SQLException{
        String sql = "select * from users where username = ?";
        List<User> list = this.selectBySql(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);       
    }
    public List<User> selectAll() throws SQLException{
        String sql = "select * from users";
        return this.selectBySql(sql);
    }
    public List<User> selectBySql(String sql,Object ...args) throws SQLException{
        List<User> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()){
                User us = new User();
                us.setId(rs.getInt("id"));
                us.setUser(rs.getString("username"));
                us.setPass(rs.getString("passwords"));
                us.setRole(rs.getBoolean("roles"));
                list.add(us);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
        }
        return list;
    }
}
