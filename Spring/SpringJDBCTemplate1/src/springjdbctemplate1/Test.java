/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springjdbctemplate1;
import org.springframework.context.ApplicationContext;   
import org.springframework.context.support.ClassPathXmlApplicationContext; 
/**
 *
 * @author Aiswarya
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
         
        EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
        
        int status=dao.saveEmployee(new Employee(101,"Anu",25000));
        System.out.println(status);
        
        
         /*
          int status=dao.updateEmployee(new Employee(101,"Anusree",30000));
        System.out.println(status);
       
        
         Employee e=new Employee();
         e.setId(101);
         int status=dao.deleteEmployee(e);
          System.out.println(status); 
         
        */
    }
}
