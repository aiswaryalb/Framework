/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateapp;

/**
 *
 * @author Aiswarya
 */
public class Employee {
    private int id;
    private String firstName,lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
