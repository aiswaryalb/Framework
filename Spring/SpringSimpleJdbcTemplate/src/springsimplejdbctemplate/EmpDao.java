/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springsimplejdbctemplate;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

/**
 *
 * @author Aiswarya
 */
class EmpDao {
    
    SimpleJdbcTemplate template;

    public EmpDao(SimpleJdbcTemplate template) {
        this.template = template;
    }
    public int update(Employee e)
    {
     String query="update employee set name=? where id=?";  
   return template.update(query,e.getName(),e.getId()); 
//        String query="update employee set name=?,salary=? where id=?";   
//        return template.update(query,e.getName(),e.getSalary(),e.getId());  
        
    }
    
    
}
