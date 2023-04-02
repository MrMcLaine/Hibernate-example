package org.example;

import org.example.entity.Cart;
import org.example.entity.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Arrays;
import java.util.HashSet;

public class Application {
    public static void main(String[] args) {

        // create configuration object with credentials to DB
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        Item item1 =  new Item(11);
        Item item2 =  new Item(22);
        Item item3 =  new Item(33);
        Item item4 =  new Item(44);

        Cart cart = new Cart(1, "Some Name");
        cart.setItems(new HashSet<>(Arrays.asList(item1, item2, item3, item4)));

        session.persist(cart);

        transaction.commit();
        session.close();
    }

}