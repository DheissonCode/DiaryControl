package DAO;


import Entity.ParametrosDb;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

// Classe Abstrata 
public abstract class GenericDAO {
    
    private static final long serialVersionId = 1L;
    static ConfiguracaoDAO conf = new ConfiguracaoDAO();
    static ParametrosDb par = new ParametrosDb();
    // método para obter a conexão com o banco de dados
    public Connection getConnection() {
        try {
            par = conf.loadConf();
            Connection cn = DriverManager.getConnection("jdbc:mysql://"+par.getUrl()+"/"+par.getDb(), par.getUser(), par.getPass());
            return cn;
        } catch (SQLException | IOException ex) {
            Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco!!");
            return null;
        }
    } // fim getConnection
    
    // Query normal
    public Statement getStatement() throws SQLException {
        return getConnection().createStatement();
    } // fim getStatement
    
    // Query pré-compilada
    public PreparedStatement getprePreparedStatement(String sql) throws SQLException {
        return getConnection().prepareStatement(sql);
    } // fim getprePreparedStatement
    
    public ResultSet executeQuery(String query,Object... params) throws SQLException {
        PreparedStatement ps = getprePreparedStatement(query);
        
        for (int i=0; i <params.length; i++) {
            ps.setObject(1+i, params[i]);
        }
        return ps.executeQuery();    
    }
    // método que executa INSERT, DELETE e UPDATES no BD
    public int executeComand(String query,Object... params) throws SQLException {
        PreparedStatement ps = getprePreparedStatement(query);
        
        for (int i=0; i <params.length; i++) {
            ps.setObject(1+i, params[i]);
        }
        int result = ps.executeUpdate();
        ps.close();
        return result;
    } // fim do executeComand
    
} // fim da Classe