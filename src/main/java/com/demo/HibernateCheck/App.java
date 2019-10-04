package com.demo.HibernateCheck;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.demo.entity.UserDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	UserDetails user = new UserDetails();
    		
    	user.setUserId(2);
    	user.setUserName("Narayan");
    	
       Configuration config = new Configuration();
       config.configure("/hibernate.cfg.xml").addAnnotatedClass(UserDetails.class);
       SessionFactory factory = config.buildSessionFactory();
       Session session = factory.openSession();
           
       Transaction tx = session.beginTransaction();
       
       session.save(user);
       
       tx.commit();
       session.close();
       
    }
}
