/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Aiswarya
 */
public class RegisterAction extends ActionSupport{
    private String name,password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void validate()
    {
        if(name.length()<1)
        {
            addFieldError("name", "Name cannot be blank");
        }
        if(password.length()<6)
        {
            addFieldError("password", "Password length must be greater than 6");
        }
    }
    public String execute()
    {
        return "success";
    }
}
