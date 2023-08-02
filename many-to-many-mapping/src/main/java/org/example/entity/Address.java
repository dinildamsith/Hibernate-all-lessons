package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Address {
    @Id
    private int aid;
    private String name;
    @ManyToMany(mappedBy = "address")
    private List<Customer> customer;

    public Address() {
    }

    public Address(int aid, String name, List<Customer> customer) {
        this.aid = aid;
        this.name = name;
        this.customer = customer;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
}
