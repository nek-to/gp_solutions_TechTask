package com.models;

public class Address {
    private String AddressLine;
    private String City;
    private String Country;
    private String State;

    public String getAddressLine() {
        return AddressLine;
    }

    public void setAddressLine(String addressLine) {
        AddressLine = addressLine;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "AddressLine='" + AddressLine + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
