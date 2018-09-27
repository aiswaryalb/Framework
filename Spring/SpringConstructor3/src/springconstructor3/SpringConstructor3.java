/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springconstructor3;

import groovy.swing.factory.BeanFactory;
import javax.annotation.Resource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author Aiswarya
 */
public class SpringConstructor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassPathResource r=  new ClassPathResource("applicationContext.xml");
       XmlBeanFactory factory=new XmlBeanFactory(r);
        Question q=(Question) factory.getBean("q");
        q.displayInfo();
        
        
    }
}
