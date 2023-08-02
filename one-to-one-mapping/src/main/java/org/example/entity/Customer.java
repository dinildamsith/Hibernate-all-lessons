package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Customer {
    @Id
    private int cid;
    private String name;
    @OneToOne
    private Address address;

    public Customer(int id, String name, Address address) {
        this.cid = id;
        this.name = name;
        this.address = address;
    }

    public Customer() {
    }

    public int getId() {
        return cid;
    }

    public void setId(int id) {
        this.cid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}