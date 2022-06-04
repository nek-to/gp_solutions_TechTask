package com.models;

public class Hotel {
    private String Name;
    private Address Address;
    private String Price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public com.models.Address getAddress() {
        return Address;
    }

    public void setAddress(com.models.Address address) {
        Address = address;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Name='" + Name + '\'' +
                ", Address=" + Address +
                ", Price='" + Price + '\'' +
                '}';
    }
}
