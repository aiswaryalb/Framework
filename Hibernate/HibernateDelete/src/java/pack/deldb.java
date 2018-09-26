/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Aiswarya
 */
public class deldb {
    public static void deleteitem(del d)
    {
        Session s=new Configuration().configure().buildSessionFactory().openSession();
        Object o1=s.load(del.class,new Integer(1));
        del b=(del) o1;
        Transaction t=s.beginTransaction();
        t.begin();
        s.delete(b);
        t.commit();
        s.close();
        
                
        
        
        
    }
    
}
