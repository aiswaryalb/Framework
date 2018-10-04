/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springjdbcrowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author Aiswarya
 */
class EmployeeDao {
    
    private JdbcTemplate template;

    public EmployeeDao(JdbcTemplate template) {
        this.template = template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public EmployeeDao() {
        System.out.println("Default Constructor");
    }
    
    
    
    public List<Employee> getAllEmployeesRowMapper(){  
   
 return template.query("select * from employee",new ResultSetExtractor<List<Employee>>(){  
     
         public List<Employee> extractData(ResultSet rs) throws SQLException,  
            DataAccessException {  
      
        List<Employee> list=new ArrayList<Employee>();  
        while(rs.next()){  
        Employee e=new Employee();  
        e.setId(rs.getInt(1));  
        e.setName(rs.getString(2));  
        e.setSalary(rs.getInt(3));  
        list.add(e);  
        }  
        return list;  
        }  
    });  
}
}
