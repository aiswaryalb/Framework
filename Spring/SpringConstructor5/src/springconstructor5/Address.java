/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springconstructor5;

/**
 *
 * @author Aiswarya
 */
class Address {
    private String addressLine1,city,state,country; 

    public Address(String addressLine1, String city, String state, String country) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public String toString()
    {
        return addressLine1+" "+city+" "+state+" "+country;
    }
}
