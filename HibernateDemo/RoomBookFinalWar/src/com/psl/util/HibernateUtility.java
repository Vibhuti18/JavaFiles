package com.psl.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private static SessionFactory sf;
static{
	sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	
}
public static Session getSesssion() {
	Session session=sf.openSession();
	return session;
}

}
