/**
 *
 * @author zEveerY
 */

package DAO;

import Entity.Contacts;
import java.sql.SQLException;
import DAO.GenericDAO;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ContactsDAO extends GenericDAO
{
    
 
    public void getContacts (Integer day, Integer month, Integer year) throws SQLException
    {
        
        String query = "SELECT * FROM event WHERE day = ? AND month = ? AND year = ?";
        executeQuery(query, day, month, year);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
        
    }
        //This is method for populate Taks on MainForm
     public List<Contacts> getContactsList (Integer day, Integer month, Integer year) throws SQLException
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        String query = "SELECT * FROM event WHERE day = ? AND month = ? AND year = ?";
        ResultSet rs = executeQuery(query, day, month, year);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
                
                while(rs.next())
                {
                contatu.add(populateContacts(rs));
                }
                rs.close();
        return contatu;
    }
        
    public List<Contacts> getAllContacts() throws SQLException 
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        ResultSet rs = executeQuery("SELECT * FROM contacts ");
                
                while(rs.next())
                {
                contatu.add(populateContactsMain(rs));
                }
                rs.close();
        return contatu;
    }
    
    //This is a test
        public List<Contacts> getAllContactsPerName(String name) throws SQLException 
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        ResultSet rs = executeQuery("SELECT * FROM contacts WHERE client LIKE ?",name+"%");
                
                while(rs.next())
                {
                contatu.add(populateContactsMain(rs));
                }
                rs.close();
        return contatu;
    }   
            //This is a test
        public List<Contacts> getAllContactsPerCpf(String cpf) throws SQLException 
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        ResultSet rs = executeQuery("SELECT * FROM contacts WHERE cpf LIKE ?",cpf+"%");
                
                while(rs.next())
                {
                contatu.add(populateContactsMain(rs));
                }
                rs.close();
        return contatu;
    }   
            
    public Integer addContacts(Contacts contatu ) throws SQLException
    {
        String query = "INSERT INTO contacts(client, zone, phone1, phone2, cellphone1, cellphone2, email, callin, others, origin, cpf, zipcode, text) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        executeComand(query, contatu.getClient(), contatu.getZone(), contatu.getContact(), contatu.getPhone1(), contatu.getPhone2(), contatu.getCellphone1(), contatu.getCellphone2(), contatu.getEmail(), contatu.getCallin(), contatu.getOthers(), contatu.getOrigin(), contatu.getCpf(), contatu.getZipcode(), contatu.getText());
        return contatu.getId();
        
    }
    
    public void updateContacts(Contacts contatu) throws SQLException
    {
        String query = "UPDATE contacts SET day = ?, month = ?, year = ?, notes = ? WHERE id =?";
        executeComand(query, contatu.getClient(), contatu.getZone(), contatu.getContact(), contatu.getPhone1(), contatu.getPhone2(), contatu.getCellphone1(), contatu.getCellphone2(), contatu.getEmail(), contatu.getCallin(), contatu.getOthers(), contatu.getOrigin(), contatu.getCpf(), contatu.getZipcode(), contatu.getText(), contatu.getId());        
        
    }
    
    public void deleteContacts(Contacts contatu ) throws SQLException
    {
        String query = "DELETE FROM contacts WHERE id = ? ";
        executeComand(query, contatu.getId());
    
    }

    private Contacts populateContactsMain(ResultSet rs) throws SQLException {
        Contacts retorno = new Contacts();
        
        retorno.setId(Integer.parseInt(rs.getString("id")));
        retorno.setClient(rs.getString("client"));
        retorno.setPhone1(rs.getString("phone1"));
        retorno.setCellphone1(rs.getString("cellphone1"));
        retorno.setEmail(rs.getString("email"));
        retorno.setCpf(rs.getString("cpf"));
        retorno.setText(rs.getString("text"));
        
        return retorno;
        
    }
    
        private Contacts populateContacts(ResultSet rs) throws SQLException {
        Contacts retorno = new Contacts();
        
        retorno.setId(Integer.parseInt(rs.getString("id")));   
        
        return retorno;
        
    }
    
}

