package com.models;


/**
 *   Main model from Hotels.xml
 */

public class Hotel {
    private String name;
    private Address address;
    private String price;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", price='" + price + '\'' +
                '}';
    }
}
