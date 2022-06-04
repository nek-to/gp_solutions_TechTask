package com.filter;

import com.convertation.ConvertXMLInObjects;
import com.convertation.RunReadXML;
import com.models.Hotel;
import com.models.Hotels;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.List;
import java.util.stream.Collectors;

public class Filtration {
    public static void main(String[] args) {
        RunReadXML readXML = new RunReadXML();
        ConvertXMLInObjects convertXMLInObjects = new ConvertXMLInObjects();
        List<Hotel> listOfHotels = readXML.readingXml();
        List<Hotel> hotels = listOfHotels.stream().filter(hotel -> hotel.getName().contains("Hilton") &&
                (hotel.getAddress().getCity().toUpperCase().contains("NEW YORK") ||
                        hotel.getAddress().getCity().toUpperCase().contains("NY"))).collect(Collectors.toList());
//        System.out.println(hotels);
        hotels.forEach(System.out::println);
    }
}
