/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Aiswarya
 */
public class Profile {
    public String execute()
    {
        HttpSession session= ServletActionContext.getRequest().getSession(false);
        if(session==null||session.getAttribute("login")==null)
            return "login";
        else
            return "success";
    }
}
