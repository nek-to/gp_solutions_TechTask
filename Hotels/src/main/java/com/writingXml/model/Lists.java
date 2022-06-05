package com.writingXml.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *   Adding class to create an output model using JAXB lib
 */

@XmlRootElement(name = "Lists")
public class Lists {
    @XmlElement(name = "Names")
    private Name names;
    @XmlElement(name = "Prices")
    private Price prices;
    @XmlElement(name = "Addresses")
    private Address addresses;

    public Lists() {
    }

    public Lists(Name names, Price prices, Address addresses) {
        this.names = names;
        this.prices = prices;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Lists{" +
                "names=" + names +
                ", prices=" + prices +
                ", addresses=" + addresses +
                '}';
    }
}
