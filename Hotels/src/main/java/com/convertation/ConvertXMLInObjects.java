package com.convertation;

import com.models.Address;
import com.models.Hotel;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Converting Hotels.xml into Objects using SAX method lib
 */

public class ConvertXMLInObjects extends DefaultHandler {
    private final StringBuilder currentValue = new StringBuilder();
    List<Hotel> hotelsList;
    Hotel hotel;
    Address address;

    public List<Hotel> getResult() {
        return hotelsList;
    }

    @Override
    public void startDocument() {   // Start Doc Override method
        hotelsList = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {  //Entry point into every opening param
        currentValue.setLength(0);
        if (qName.equalsIgnoreCase("Hotel")) {
            hotel = new Hotel();
            String price = attributes.getValue("Price");
            hotel.setPrice(price);
        }
        if (qName.equalsIgnoreCase("Address")) {
            address = new Address();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) { // Ending point into every closed param
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
    public void characters(char[] ch, int start, int length) { // Reading char in between starting and ending param
        currentValue.append(ch, start, length);
    }

    public void endDocument() {  // Ending point of Doc
    }
}
