/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class JDBCHelper {

    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String durl = "jdbc:sqlserver://localhost:1433;databaseName = truyenTranh";
    static String duser = "sa";
    static String dpass = "sa";

    static{
        try {
            Class.forName(driver);
           
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException{
        Connection conn = DriverManager.getConnection(durl,duser,dpass);
        PreparedStatement ps = null;
        if(sql.trim().startsWith("{")){
            try {
                ps = conn.prepareCall(sql);//proc
            } catch (SQLException ex) {
                Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                ps = conn.prepareStatement(sql);//sql
            } catch (SQLException ex) {
                Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(int i = 0;i < args.length; i++){
            ps.setObject(i + 1, args[i]);
        }
        return ps;
    }
    public static ResultSet query(String sql, Object... args) throws SQLException{
        PreparedStatement ps = JDBCHelper.getStmt(sql, args);
        return  ps.executeQuery();
    }
    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static int update(String sql, Object... args){
        try {
            PreparedStatement ps = JDBCHelper.getStmt(sql, args);
            try {
                return ps.executeUpdate();
            } 
            finally{
                ps.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}

