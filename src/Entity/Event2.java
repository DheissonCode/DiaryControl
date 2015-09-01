/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Forms.SwingColumn;
import java.sql.Date;

/**
 *
 * @author Igor
 */
public class Event2 {
    
    private Integer id;
    @SwingColumn (description="Dia")
    private Integer day;
    @SwingColumn (description="Mês")
    private Integer month;
    @SwingColumn (description="Ano")
    private Integer year;
    @SwingColumn (description="Nota")
    private String notes;
    @SwingColumn (description="Local")
    private String locate;
    @SwingColumn (description="Serviço")
    private String tservice;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public String getTservice() {
        return tservice;
    }

    public void setTservice(String tservice) {
        this.tservice = tservice;
    }
    
    
    
}
