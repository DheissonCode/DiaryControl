/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */

import Entity.Event;
import java.sql.SQLException;
import DAO.GenericDAO;
import Entity.Event2;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class EventDAO extends GenericDAO
{
    
 
    public void getEvent (Integer day, Integer month, Integer year) throws SQLException
    {
        
        String query = "SELECT * FROM event WHERE day = ? AND month = ? AND year = ?";
        executeQuery(query, day, month, year);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
        
    }
        //This is method for populate Taks on MainForm
     public List<Event> getEventList (Integer day, Integer month, Integer year) throws SQLException
    {
        List<Event> events = new LinkedList<Event>();
        
        String query = "SELECT * FROM event WHERE day = ? AND month = ? AND year = ?";
        ResultSet rs = executeQuery(query, day, month, year);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
                
                while(rs.next())
                {
                events.add(populateEvent(rs));
                }
                rs.close();
                

        return events;
    }
        
    public List<Event> getAllEventDay() throws SQLException 
    {
        List<Event> events = new LinkedList<Event>();
        
        ResultSet rs = executeQuery("SELECT * FROM event ");
                
                while(rs.next())
                {
                events.add(populateEvent(rs));
                }
                rs.close();
        return events;
    }
    
     public List<Event2> getAllEventDayB() throws SQLException 
    {
        List<Event2> events = new LinkedList<Event2>();
        
        ResultSet rs = executeQuery("SELECT * FROM event ");
                
                while(rs.next())
                {
                events.add(populateEventB(rs));
                }
                rs.close();
        return events;
    }
    
    //This is a test
        public List<Event> getAllEventsPerDate(Integer day) throws SQLException 
    {
        List<Event> events = new LinkedList<Event>();
        
        ResultSet rs = executeQuery("SELECT * FROM event WHERE day LIKE ?",day+"%");
                
                while(rs.next())
                {
                events.add(populateEvent(rs));
                }
                rs.close();
        return events;
    }   
            
    public Integer addEvent(Event2 events ) throws SQLException
    {
        String query = "INSERT INTO event(day, month, year, notes, locate, tservice) VALUES (?,?,?,?,?,?)";
        executeComand(query, events.getDay(), events.getMonth(), events.getYear(), events.getNotes(), events.getLocate(), events.getTservice());
        return events.getId();
        
    }
    
    public void updateEvent(Event2 events) throws SQLException
    {
        String query = "UPDATE event SET day = ?, month = ?, year = ?, notes = ?, locate = ?, tservice = ? WHERE id =?";
        executeComand(query, events.getDay(), events.getMonth(), events.getYear(), events.getNotes(), events.getId());        
        
    }
    
    public void deleteEvent(Event2 events ) throws SQLException
    {
        String query = "DELETE FROM event WHERE id = ? ";
        executeComand(query, events.getId());
    
    }

    private Event populateEvent(ResultSet rs) throws SQLException {
        Event retorno = new Event();
        
        retorno.setId(Integer.parseInt(rs.getString("id")));
        retorno.setDay(Integer.parseInt(rs.getString("day")));
        retorno.setMonth(Integer.parseInt(rs.getString("month")));
        retorno.setYear(Integer.parseInt(rs.getString("year")));
        retorno.setNotes(rs.getString("notes"));
        retorno.setLocate(rs.getString("locate"));
        retorno.setTservice(rs.getString("tservice"));
        
        return retorno;
        
    }
        private Event2 populateEventB(ResultSet rs) throws SQLException {
        Event2 retorno = new Event2();
        
        retorno.setId(Integer.parseInt(rs.getString("id")));
        retorno.setDay(Integer.parseInt(rs.getString("day")));
        retorno.setMonth(Integer.parseInt(rs.getString("month")));
        retorno.setYear(Integer.parseInt(rs.getString("year")));
        retorno.setNotes(rs.getString("notes"));
        retorno.setLocate(rs.getString("locate"));
        retorno.setTservice(rs.getString("tservice"));
        
        return retorno;
        
    }
    
    
}
