/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import com.opensymphony.xwork2.Preparable;

/**
 *
 * @author Aiswarya
 */
public class Login implements Preparable{
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
@Override  
public void prepare()throws Exception
{
    System.out.println("Preparation logic");
}
    
    public String execute()
    {
        System.out.println("Actual business logic");
        if(password.equals("admin"))
        {
            return "success";
        }
        else
        {
            return "error";
        }
    }
}

