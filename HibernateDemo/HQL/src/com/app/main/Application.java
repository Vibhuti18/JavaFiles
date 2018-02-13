package com.app.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.app.model.Actor;

public class Application {

	public static void main(String[] args) {
		
		// List<Actor> actorList = getListOfActors();
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
				buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	/*	for (Actor actor : actorList) {
			session.save(actor);
		}
		*/
		// CRITERIA 
		
		// Aggregate functions are supported by Projections
		
		int rank = (int) session.createCriteria(Actor.class)
		.setProjection(Projections.max("rank")).uniqueResult();
		
		/*List<Actor> actors = session.createCriteria(Actor.class)
									.add(Restrictions.or
											(Restrictions.le("rank", 10), Restrictions.like("performance", "%Ex%")))
									.add(Restrictions.le("rank", 10))
									.add(Restrictions.like("performance", "%Ex%"))
									.list();*/
		
		/*List<Actor> actors = session.createNativeQuery("select * from actor_details where actor_rank <= 10")
		.addEntity(Actor.class).list();*/
		
		/*List<Actor> actors = session.createQuery("from Actor where rank <= :rank")
									.setParameter("rank", 10).list();*/

		/*List<Actor> actors = session.getNamedQuery("findActorByRank").setParameter("rank", 10).list();*/
		
		List<Actor> actors = session.createQuery("from Actor").setFirstResult(0).setMaxResults(3).list();
		// Assignment , use Query object
		//setFirstResult
		//setMaxResults
		
		
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("*************"+rank);
		
		for (Actor actor : actors) {
			System.out.println(actor.getName()+ " "+actor.getPerformance());
		}
		
		sessionFactory.close();
		
	}
	
	private static List<Actor> getListOfActors() {
		
		List<Actor> actorList = new ArrayList<Actor>();
		
		Actor actor1 = new Actor();
		actor1.setName("Akshay");
		actor1.setPerformance("Excellant");
		actor1.setRank(2);
		actorList.add(actor1);
		
		Actor actor2 = new Actor();
		actor2.setName("Sonakshi");
		actor2.setPerformance("Average");
		actor2.setRank(10);
		actorList.add(actor2);
		
		Actor actor3 = new Actor();
		actor3.setName("SRK");
		actor3.setPerformance("OK");
		actor3.setRank(5);
		actorList.add(actor3);
		
		Actor actor4 = new Actor();
		actor4.setName("Salman");
		actor4.setPerformance("Poor");
		actor4.setRank(11);
		actorList.add(actor4);
		
		Actor actor5 = new Actor();
		actor5.setName("Kangana");
		actor5.setPerformance("Excellant");
		actor5.setRank(3);
		actorList.add(actor5);
		
		Actor actor6 = new Actor();
		actor6.setName("Sunny");
		actor6.setPerformance("Worst");
		actor6.setRank(1000);
		actorList.add(actor6);
		
		return actorList;
	}

	

}










