package com.filter;

import com.convertation.ConvertXMLInObjects;
import com.readingXml.ReadXML;
import com.models.Hotel;

import java.util.List;
import java.util.stream.Collectors;

/**
 *  Filtration class to filter converted xml Objects by conditions
 *  Name = Hilton  &&  State = NY, New York -> NEW YORK (to bring to a single format (upper or lower case))
 */

public class Filtration {
    public static List<Hotel> filtrationMethod(){
        ReadXML readXML = new ReadXML();
        List<Hotel> listOfHotels = readXML.readingXml();
        List<Hotel> hotels = listOfHotels.stream().filter(hotel -> hotel.getName().contains("Hilton") &&
                (hotel.getAddress().getState().toUpperCase().contains("NEW YORK") ||
                        hotel.getAddress().getState().toUpperCase().contains("NY"))).collect(Collectors.toList());
        return hotels;
    }
}
