/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Forms.SwingColumn;

/**
 *
 * @author zEveerY
 */
public class Contacts2 {
    
    private Integer id;
    @SwingColumn (description="Cliente")
    private String client;
    private String address;
    private String zone;
    private String contact;
    @SwingColumn (description="Telefone 1")
    private String phone1;
    @SwingColumn (description="Telefone 2")
    private String phone2;
    @SwingColumn (description="Celular 1")
    private String cellphone1;
    @SwingColumn (description="Celular 2")
    private String cellphone2;
    private String email;
    private Integer month;
    private Integer year;
    private String origin;
    private String cpf;
    private String zipcode;
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getCellphone1() {
        return cellphone1;
    }

    public void setCellphone1(String cellphone1) {
        this.cellphone1 = cellphone1;
    }

    public String getCellphone2() {
        return cellphone2;
    }

    public void setCellphone2(String cellphone2) {
        this.cellphone2 = cellphone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    
}
