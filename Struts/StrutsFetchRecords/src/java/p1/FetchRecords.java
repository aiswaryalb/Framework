/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Aiswarya
 */
public class FetchRecords {
    
    ArrayList<User> list=new ArrayList<User>();

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }
    
    public String execute()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            PreparedStatement ps=con.prepareStatement("select * from csuser");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                User user=new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPassword(rs.getString(3));
                list.add(user);
            }
            con.close();
        } catch (Exception e) {e.printStackTrace();
        }
        return "success";
    }
    
    
}
