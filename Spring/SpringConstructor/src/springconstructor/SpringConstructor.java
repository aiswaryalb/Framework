/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springconstructor;

import groovy.swing.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author Aiswarya
 */
public class SpringConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        ClassPathResource resource=new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory=new XmlBeanFactory(resource);
        Employee s;
        s=(Employee) factory.getBean("e");
        s.show();
        
        
    }
}
