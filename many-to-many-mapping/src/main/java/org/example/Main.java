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

        Customer c1=new Customer();
        c1.setId(1);
        c1.setName("Udara");

        Customer c2=new Customer();
        c2.setId(2);
        c2.setName("San");

        Address a1=new Address();
        a1.setAid(1);
        a1.setName("Colombo");

        Address a2=new Address();
        a2.setAid(2);
        a2.setName("Panadura");

        List<Customer> customerList=new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        List<Address> addressList=new ArrayList<>();
        addressList.add(a1);
        addressList.add(a2);

        c1.setAddress(addressList);
        c2.setAddress(addressList);
        a1.setCustomer(customerList);
        a2.setCustomer(customerList);

        Session session=
                FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();


        session.persist(c1);
        session.persist(c2);
        session.persist(a1);
        session.persist(a2);


        transaction.commit();

        session.close();
    }
}