/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springsetter2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 *
 * @author Aiswarya
 */
public class SpringSetter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Employee e=(Employee)factory.getBean("obj");  
    e.displayInfo();  
    }
}
