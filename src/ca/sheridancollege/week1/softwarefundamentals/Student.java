/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author annrp
 */
public class Student {
    
    private String name;
  
    private String email;
    
    private String Hours;

    /**
     * Get the value of Hours
     *
     * @return the value of Hours
     */
    public String getHours() {
        return Hours;
    }

    /**
     * Set the value of Hours
     *
     * @param Hours new value of Hours
     */
    public void setHours(String Hours) {
        this.Hours = Hours;
    }


    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
