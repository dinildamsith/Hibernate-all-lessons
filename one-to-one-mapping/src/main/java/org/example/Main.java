package org.example;

import org.example.entity.Address;
import org.example.entity.Customer;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {
    public static void main(String[] args) {
        Address address=new Address();
        address.setAid(1);
        address.setName("Colombo");

        Customer customer=new Customer();
        customer.setId(1);
        customer.setName("san");
        customer.setAddress(address);

        Session session=
                FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(address);
        session.persist(customer);

        transaction.commit();

        session.close();
    }
}