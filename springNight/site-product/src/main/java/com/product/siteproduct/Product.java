package com.product.siteproduct;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private String place;
    private int wranty;

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(String name, String type, String place, int wranty) {

        this.name = name;
        this.type = type;
        this.place = place;
        this.wranty = wranty;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPlace() {
        return place;

    }

    public int getWranty() {
        return wranty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type)

    {
        this.type = type;

    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setWranty(int wranty) {
        this.wranty = wranty;
    }

    @Override
    public String toString() {
        return "name :" + this.name + "\nplace :" + this.place + "\ntype :" + this.type + "\nwranty :" + this.wranty;
    }
}
