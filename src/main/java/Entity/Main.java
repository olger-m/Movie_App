package Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Movie movie= new Movie(1,"test");

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Main.class).buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(new Movie(8,"yygjl"));
        session.getTransaction().commit();
    }
}
