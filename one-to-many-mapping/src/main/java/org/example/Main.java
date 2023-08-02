package org.example;

import org.example.entity.Address;
import org.example.entity.Customer;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address1=new Address();
        address1.setAid(1);
        address1.setName("Colombo");

        Address address2=new Address();
        address2.setAid(2);
        address2.setName("Panadura");

        Customer customer=new Customer();
        customer.setId(1);
        customer.setName("san");
        List<Address>addressList=new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);
        customer.setAddress(addressList);
        address1.setCustomer(customer);
        address2.setCustomer(customer);

        Session session=
                FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(address1);
        session.persist(address2);
        session.persist(customer);

        transaction.commit();

        session.close();
    }
}