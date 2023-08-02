package org.example;

import org.example.entity.Address;
import org.example.entity.Customer;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Address address1=new Address();
//        address1.setAid(1);
//        address1.setName("Colombo");
//
//        Address address2=new Address();
//        address2.setAid(2);
//        address2.setName("Panadura");
//
//        Customer customer=new Customer();
//        customer.setId(1);
//        customer.setName("san");
//        List<Address>addressList=new ArrayList<>();
//        addressList.add(address1);
//        addressList.add(address2);
//        customer.setAddress(addressList);
//        address1.setCustomer(customer);
//        address2.setCustomer(customer);

        Session session=
                FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

//        session.persist(address1);
//        session.persist(address2);
//        session.persist(customer);



        //fetch all customer type data
//        Query query=session.createQuery("from Customer");
//        List<Customer> list=query.list();
//        for (Customer customer : list) {
//            System.out.println(customer);
//        }

        //fetch one unique data
//        Query query=session.createQuery("from Customer where cid=?1");
//        query.setParameter(1,"1");
//        Customer customer= (Customer)  query.uniqueResult();
//        System.out.println(customer);

        //custom fields one data fetch
//        Query query=session.createQuery("select cid,name from Customer where cid=?1");
//        query.setParameter(1,"1");
//        Object[] customer= (Object[]) query.uniqueResult();
//        System.out.println(customer[0]+" - "+customer[1]);

        //custom fields all data fetch
//        Query query=session.createQuery("select cid,name from Customer");
//        List<Object[]> customerList= query.list();
//        for (Object[] customer : customerList) {
//            System.out.println(customer[0]+" - "+customer[1]);
//        }

        //join query data fetch
//        Query query=session.createQuery("select a.aid,a.name from Address a inner join Customer c on a.aid = c.cid");
//        List<Object[]> list= query.list();
//        for (Object[] objects : list) {
//            System.out.println(objects[0]+" - "+objects[1]);
//        }



        transaction.commit();

        session.close();
    }
}