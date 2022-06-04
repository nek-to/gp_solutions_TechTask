package com.filter;

import com.convertation.ConvertXMLInObjects;
import com.readingXml.ReadXML;
import com.models.Hotel;

import java.util.List;
import java.util.stream.Collectors;

public class Filtration {
    public static void main(String[] args) {
        ReadXML readXML = new ReadXML();
        ConvertXMLInObjects convertXMLInObjects = new ConvertXMLInObjects();
        List<Hotel> listOfHotels = readXML.readingXml();
        List<Hotel> hotels = listOfHotels.stream().filter(hotel -> hotel.getName().contains("Hilton") &&
                (hotel.getAddress().getState().toUpperCase().contains("NEW YORK") ||
                        hotel.getAddress().getState().toUpperCase().contains("NY"))).collect(Collectors.toList());
//        System.out.println(hotels);
        hotels.forEach(System.out::println);
    }
}
