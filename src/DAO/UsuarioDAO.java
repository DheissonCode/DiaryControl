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
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Igor
 */
public class UsuarioDAO extends GenericDAO{
    
    
    
    public Users logar (Users user) throws SQLException{
        String sql = "SELECT * FROM users";
        
        ResultSet rs = executeQuery(sql);
        
        while(rs.next()){
            if(user.getLogin().equals(rs.getString("login")) && user.getPassword().equals(rs.getString("password"))){
                user = populateUsuario(rs);
                return user;
            }
        }
        return null;
        
    }
    
    private static Users populateUsuario(ResultSet rs) throws SQLException{
        
        Users toReturn = new Users();
        
        toReturn.setId(rs.getInt("id"));
        toReturn.setLogin(rs.getString("login"));
        toReturn.setPassword(rs.getString("password"));
        toReturn.setName(rs.getString("name"));
        
        
        return toReturn;
      }
    
    public List<Users> getAllUsers() throws SQLException 
    {
        List<Users> us = new LinkedList<Users>();
        
        ResultSet rs = executeQuery("SELECT * FROM users ");
                
                while(rs.next())
                {
                us.add(populateUsuario(rs));
                }
                rs.close();
        return us;
    }
    
    public Integer addUser(Users us ) throws SQLException
    {
        String query = "INSERT INTO users(login, password, name) VALUES (?,?,?)";
        executeComand(query, us.getLogin(), us.getPassword(), us.getName());
        return us.getId();
        
    }
    
    public boolean verifyExistence (Users user) throws SQLException{
        String sql = "SELECT * FROM users";
        
        ResultSet rs = executeQuery(sql);
        
        while(rs.next()){
            if(user.getLogin().equals(rs.getString("login"))){
                return true;
            }
        }
        return false;
        
    }
    
    public Integer editUser(Users us) throws SQLException
    {
        String query = "UPDATE users SET login = ?, password = ?, name = ? WHERE id =?";
        executeComand(query, us.getLogin(), us.getPassword(), us.getName(), us.getId());
        return us.getId();
        
    }
    public void deleteUser(Users us) throws SQLException
    {
        String query = "DELETE FROM users where id = ?";
        executeComand(query, us.getId());
        
        
    }
    
    public List<Users> getAllUsersPerName(String name) throws SQLException 
    {
        List<Users> us = new LinkedList<Users>();
        
        ResultSet rs = executeQuery("SELECT * FROM users WHERE name LIKE ?",name+"%");
                
                while(rs.next())
                {
                us.add(populateUsuario(rs));
                }
                rs.close();
        return us;
    }  
    
}
