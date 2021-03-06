/**
 *
 * @author zEveerY
 */

package DAO;

import Entity.Contacts;
import java.sql.SQLException;
import DAO.GenericDAO;
import Entity.Contacts2;
import Entity.Contacts3;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ContactsDAO extends GenericDAO
{
    
 
    public void getContacts (Integer month, Integer year) throws SQLException
    {
        
        String query = "SELECT * FROM event WHERE month = ? AND year = ? order by client ASC";
        executeQuery(query, month, year);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
        
    }
        //This is method for populate Taks on MainForm
    public List<Contacts> getContactsList (Integer month, Integer year) throws SQLException
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        String query = "SELECT * FROM event WHERE month = ? AND year = ? order by client ASC";
        ResultSet rs = executeQuery(query, month, year);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
                
                while(rs.next())
                {
                contatu.add(populateContactsMain(rs));
                }
                rs.close();
        return contatu;
    }
     
        public List<Contacts2> getContactsCallDay (Integer month, Integer year) throws SQLException
        {
        List<Contacts2> contatu = new LinkedList<Contacts2>();
        
        String query = "SELECT * FROM contacts WHERE month = ? AND year = ? order by client ASC";
        ResultSet rs = executeQuery(query, month, year);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
                
                while(rs.next())
                {
                contatu.add(populateContactsCall(rs));
                }
                rs.close();
        return contatu;
        }
        
    public List<Contacts> getAllContacts() throws SQLException 
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        ResultSet rs = executeQuery("SELECT * FROM contacts order by client ASC ");
                
                while(rs.next())
                {
                contatu.add(populateContactsMain(rs));
                }
                rs.close();
        return contatu;
    }
    
    public List<Contacts3> getAllContactsS() throws SQLException 
    {
        List<Contacts3> contatu = new LinkedList<Contacts3>();
        
        ResultSet rs = executeQuery("SELECT * FROM contacts order by client ASC");
                
                while(rs.next())
                {
                contatu.add(populateContactsAll(rs));
                }
                rs.close();
        return contatu;
    }
    
    //This is a test
        public List<Contacts> getAllContactsPerName(String name) throws SQLException 
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        ResultSet rs = executeQuery("SELECT * FROM contacts WHERE client LIKE ?","%"+name+"%");
                
                while(rs.next())
                {
                contatu.add(populateContactsMain(rs));
                }
                rs.close();
        return contatu;
    }   
        public List<Contacts> getAllContactsPerAddress(String name) throws SQLException 
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        ResultSet rs = executeQuery("SELECT * FROM contacts WHERE address LIKE ?","%"+name+"%");
                
                while(rs.next())
                {
                contatu.add(populateContactsMain(rs));
                }
                rs.close();
        return contatu;
    } 
        
         public List<Contacts> getAllContactsPerContact(String name) throws SQLException 
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        ResultSet rs = executeQuery("SELECT * FROM contacts WHERE contact LIKE ?","%"+name+"%");
                
                while(rs.next())
                {
                contatu.add(populateContactsMain(rs));
                }
                rs.close();
        return contatu;
    }
         
        public List<Contacts> getAllContactsPerZone(String name) throws SQLException 
    {
        List<Contacts> contatu = new LinkedList<Contacts>();
        
        ResultSet rs = executeQuery("SELECT * FROM contacts WHERE zone LIKE ?","%"+name+"%");
                
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
        
        ResultSet rs = executeQuery("SELECT * FROM contacts WHERE cpf LIKE ?","%"+cpf+"%");
                
                while(rs.next())
                {
                contatu.add(populateContactsMain(rs));
                }
                rs.close();
        return contatu;
    }   
        public List<Contacts> getAllContactsPerMonth(Integer month) throws SQLException 
        {
            List<Contacts> contatu = new LinkedList<Contacts>();
        
            String query = "SELECT * FROM contacts WHERE month = ? order by client ASC";
             ResultSet rs = executeQuery(query, month);
             //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
                
                while(rs.next())
                {
                    contatu.add(populateContactsMain(rs));
                }
                rs.close();
                
        return contatu;
        }   
            
    public Integer addContacts(Contacts contatu ) throws SQLException
    {
        String query = "INSERT INTO contacts(client, address, zone, contact, phone1, phone2, cellphone1, cellphone2, email, month, year, origin, cpf, zipcode, text, modified) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        executeComand(query, contatu.getClient(), contatu.getAddress(),contatu.getZone(), contatu.getContact(), contatu.getPhone1(), contatu.getPhone2(), contatu.getCellphone1(), contatu.getCellphone2(), contatu.getEmail(), contatu.getMonth(), contatu.getYear(), contatu.getOrigin(), contatu.getCpf(), contatu.getZipcode(), contatu.getText(), contatu.getModified());
        return contatu.getId();
        
    }
    
    public void updateContacts3(Contacts3 contatu) throws SQLException
    {
        String query = "UPDATE contacts SET client = ?, address = ?, zone = ?, contact = ?, phone1 = ?, phone2 = ?, cellphone1 = ?, cellphone2 = ?, email = ?, month = ?, year = ?, origin = ?, cpf = ?, zipcode = ?,  text = ?, modified = ? WHERE id =?";
        executeComand(query, contatu.getClient(), contatu.getAddress(),contatu.getZone(), contatu.getContact(), contatu.getPhone1(), contatu.getPhone2(), contatu.getCellphone1(), contatu.getCellphone2(), contatu.getEmail(), contatu.getMonth(), contatu.getYear(), contatu.getOrigin(), contatu.getCpf(), contatu.getZipcode(), contatu.getText(), contatu.getModified(), contatu.getId());        
        
    }
    public void updateContacts(Contacts contatu) throws SQLException
    {
        String query = "UPDATE contacts SET client = ?, address = ?, zone = ?, contact = ?, phone1 = ?, phone2 = ?, cellphone1 = ?, cellphone2 = ?, email = ?, month = ?, year = ?, origin = ?, cpf = ?, zipcode = ?,  text = ?, modified = ? WHERE id =?";
        executeComand(query, contatu.getClient(), contatu.getAddress(),contatu.getZone(), contatu.getContact(), contatu.getPhone1(), contatu.getPhone2(), contatu.getCellphone1(), contatu.getCellphone2(), contatu.getEmail(), contatu.getMonth(), contatu.getYear(), contatu.getOrigin(), contatu.getCpf(), contatu.getZipcode(), contatu.getText(), contatu.getModified(), contatu.getId());        
        
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
        retorno.setAddress(rs.getString("address"));
        retorno.setZone(rs.getString("zone"));
        retorno.setContact(rs.getString("contact"));
        retorno.setPhone1(rs.getString("phone1"));
        retorno.setPhone2(rs.getString("phone2"));
        retorno.setCellphone1(rs.getString("cellphone1"));
        retorno.setCellphone2(rs.getString("cellphone2"));
        retorno.setEmail(rs.getString("email"));
        retorno.setMonth(rs.getInt("month"));
        retorno.setYear(rs.getInt("year"));
        retorno.setCpf(rs.getString("cpf"));
        retorno.setZipcode(rs.getString("zipcode"));
        retorno.setText(rs.getString("text"));
        retorno.setModified(rs.getString("modified"));
        
        return retorno;
        
    }
    
        private Contacts2 populateContactsCall(ResultSet rs) throws SQLException {
        Contacts2 retorno = new Contacts2();
        
        retorno.setId(Integer.parseInt(rs.getString("id")));
        retorno.setClient(rs.getString("client"));
        retorno.setPhone1(rs.getString("phone1"));
        retorno.setPhone2(rs.getString("phone2"));
        retorno.setCellphone1(rs.getString("cellphone1"));
        retorno.setCellphone2(rs.getString("cellphone2"));
        
        return retorno;
        
    }
        
        private Contacts3 populateContactsAll(ResultSet rs) throws SQLException {
        Contacts3 retorno = new Contacts3();
        
        retorno.setId(Integer.parseInt(rs.getString("id")));
        retorno.setClient(rs.getString("client"));
        retorno.setAddress(rs.getString("address"));
        retorno.setZone(rs.getString("zone"));
        retorno.setContact(rs.getString("contact"));
        retorno.setPhone1(rs.getString("phone1"));
        retorno.setPhone2(rs.getString("phone2"));
        retorno.setCellphone1(rs.getString("cellphone1"));
        retorno.setCellphone2(rs.getString("cellphone2"));
        retorno.setEmail(rs.getString("email"));
        retorno.setMonth(Integer.parseInt(rs.getString("month")));
        retorno.setYear(Integer.parseInt(rs.getString("year")));
        retorno.setOrigin(rs.getString("origin"));
        retorno.setCpf(rs.getString("cpf"));
        retorno.setZipcode(rs.getString("zipcode"));
        retorno.setText(rs.getString("text"));
        retorno.setModified(rs.getString("modified"));
        
        return retorno;
        
    }
    
}

