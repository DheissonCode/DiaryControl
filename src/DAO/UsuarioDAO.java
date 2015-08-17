/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Users;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor
 */
public class UsuarioDAO extends GenericDAO{
    
    private Connection conectar;

    public UsuarioDAO() throws SQLException, IOException {
        this.conectar = getConnection();
    }
    
    public boolean logar (Users user) throws SQLException{
        String sql = "SELECT * FROM users";
        PreparedStatement stmt = conectar.prepareCall(sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            if(user.getLogin().equals(rs.getString("login")) && user.getPassword().equals(rs.getString("password"))){
                return true;
            }
        }
        return false;
        
    }
    
    private static Users populateUsuario(ResultSet rs) throws SQLException{
        
        Users toReturn = new Users();
        
        toReturn.setId(rs.getInt("id"));
        toReturn.setLogin(rs.getString("login"));
        toReturn.setPassword(rs.getString("password"));
        toReturn.setName(rs.getString("name"));
        
        
        return toReturn;
      }
    
}
