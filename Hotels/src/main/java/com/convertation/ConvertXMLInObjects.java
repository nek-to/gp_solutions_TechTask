package com.convertation;

import com.models.Address;
import com.models.Hotel;
import com.models.Hotels;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class ConvertXMLInObjects extends DefaultHandler {
    private final StringBuilder currentValue = new StringBuilder();
    List<Hotel> hotelsList;
    Hotel hotel;
    Address address;

    public List<Hotel> getResult() {
        return hotelsList;
    }

    @Override
    public void startDocument() {
        hotelsList = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        currentValue.setLength(0);
        if (qName.equalsIgnoreCase("Hotel")) {
            hotel = new Hotel();
            String price = attributes.getValue("Price");
            hotel.setPrice(price);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("Name")) {
            hotel.setName(currentValue.toString());
        }
        if (qName.equalsIgnoreCase("AddressLine")) {
            address.setAddressLine(currentValue.toString());
        }
        if (qName.equalsIgnoreCase("City")) {
            address.setCity(currentValue.toString());
        }
        if (qName.equalsIgnoreCase("Country")) {
            address.setCountry(currentValue.toString());
        }
        if (qName.equalsIgnoreCase("State")) {
            address.setState(currentValue.toString());
        }
        if (qName.equalsIgnoreCase("Address")) {
            hotel.setAddress(address);
        }
        if (qName.equalsIgnoreCase("Hotel")) {
            hotelsList.add(hotel);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        currentValue.append(ch, start, length);
    }
}
