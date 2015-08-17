/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.ParametrosDb;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */
public class Conexao { 
    
    static ConfiguracaoDAO conf = new ConfiguracaoDAO();
    static ParametrosDb par = new ParametrosDb();
    
    public static Connection getConnection() throws SQLException, IOException {

        try {
            par = conf.loadConf();
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conecta ao banco de dados");
            return (Connection) DriverManager.getConnection("jdbc:mysql://"+par.getUrl()+"/"+par.getDb(), par.getUser(), par.getPass());
        } catch (Exception er) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, er);
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o BD!!");
            return null;
        }
        
    }
}
