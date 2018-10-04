/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springjdbcrowmapper;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Aiswarya
 */
public class SpringJdbcRowMapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		List<Employee> list=dao.getAllEmployeesRowMapper();
		
		for(Employee e:list)
			System.out.println(e);
    }
    
    
}
