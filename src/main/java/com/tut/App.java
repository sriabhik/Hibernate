package com.tut;

import org.hibernate.Transaction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        //SessionFactory is an interface used to manipulate all through project.It is thread safe
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        //STudent class
        Student st = new Student();
        st.setId(32);
        st.setName("Srishti Priya");
        st.setCity("Patna");
       
        System.out.println(st);
        //Creating Addresss class Object
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("Chapra");
        ad.setOpen(true);
        ad.setX(123.234);
        ad.setAddedDate(new Date());
        //reading image
        
        //FileInputStream fis = new FileInputStream ("src/main/java/pic.jpg");
        //byte[] data = new byte[fis.available()];
        //fis.read(data);
        //ad.setImage(data);
        
        Session session =  factory.openSession();
        Transaction tx =  session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
    }
}
