/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s.lucas
 */
public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bdagenda";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão:"+ex.getMessage());

        }

    }

    public static void closeConnection(Connection con) throws SQLException {

        if (con != null) {
            con.close();

        }
    }

    public static void closeConnection(Connection con,
            PreparedStatement stmt) throws SQLException {
        closeConnection(con);

        if (stmt != null) {
            stmt.close();
        }

    }
public static void closeConnection(Connection con,
            PreparedStatement stmt, Resultset rs) throws SQLException {
    closeConnection(con, stmt);
    if(rs != null) {
        rs.close();
        
    }
}
}
