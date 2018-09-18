/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Aiswarya
 */
public class RegisterDao {
    public static int save(RegisterAction r)
    {
        int status=0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
	Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            PreparedStatement ps=con.prepareStatement("insert into strutuser values(?,?,?,?) ");
            ps.setString(1, r.getName());
            ps.setString(2, r.getPassword());
            ps.setString(3, r.getEmail());
            ps.setString(4, r.getGender());
        status=ps.executeUpdate();
        } catch (Exception e) {
        }
        return status;
    }
    
}
