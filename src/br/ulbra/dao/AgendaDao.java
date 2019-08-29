/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import br.ulbra.model.Agenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author s.lucas
 */
public class AgendaDao {
    
    public void create (Agenda a) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt =
                 con.prepareStatement("INSERT INTO "
                         + "tbagenda(nome,celular,telefone,email,DataAni) VALUES(?,?,?,?,?)");
                         stmt.setString(1, a.getNome());
                         stmt.setString(2, a.getCelular());
                         stmt.setString(3, a.getTelefone());
                         stmt.setString(4, a.getEmail());
                         stmt.setString(5, a.getDataAni());
                         stmt.executeUpdate();
                         JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                    } catch (SQLException ex){
                        System.out.println(ex);
                    }finally {
            ConnectionFactory.closeConnection(con, stmt);
            
                   
        }
        
   }
   
}
