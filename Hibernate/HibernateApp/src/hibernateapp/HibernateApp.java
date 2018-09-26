/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateapp;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Aiswarya
 */
public class HibernateApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
        Employee e=new Employee();
        e.setId(121);
        e.setFirstName("Aiswarya");
        e.setLastName("Pillai");
                
        session.persist(e);
        t.commit();
        
        session.close();
        System.out.println("Successfully saved");
        
    }
}
