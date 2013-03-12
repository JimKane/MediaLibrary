package org.medialibrary;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.medialibrary.mediaClasses.Book;

public class Library {
	private static ServiceRegistry serviceRegistry;
	public static void main(String[] args) {
		
		Book book = createTheBookBFG();

		Configuration configuration = new Configuration(); 
		configuration.configure(); 
		serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}

	private static Book createTheBookBFG() {
		Book book = new Book();
		book.setTitle("The BFG");
		book.setAuthor("Roald Dahl");
		book.setGenre("Childrens");
		book.setLanguage("English");
		book.setNumberOfPages(467);
		book.setYearOfPublication(1981);
		return book;
	}

}
