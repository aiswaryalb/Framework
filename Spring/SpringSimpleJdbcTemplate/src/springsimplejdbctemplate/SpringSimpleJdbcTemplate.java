/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springsimplejdbctemplate;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;   
import org.springframework.core.io.ClassPathResource;   
import org.springframework.core.io.Resource; 

/**
 *
 * @author Aiswarya
 */
public class SpringSimpleJdbcTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Resource r=(Resource) new ClassPathResource("applicationContext.xml");
         BeanFactory factory=new XmlBeanFactory(r);  
         EmpDao dao=(EmpDao)factory.getBean("edao");  
         int status=dao.update(new Employee(100,"Tarun",35000));   
         System.out.println(status);  
         
    }
}
