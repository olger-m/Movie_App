package com.moviedb;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(sessionFactory);
    }
}