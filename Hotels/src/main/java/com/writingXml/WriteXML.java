package com.writingXml;


import com.filter.Filtration;
import com.models.Hotel;
import com.writingXml.model.Address;
import com.writingXml.model.Lists;
import com.writingXml.model.Name;
import com.writingXml.model.Price;

import javax.xml.bind.*;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Writing class to write filtered List of Hotels in output file FilteredHotels.xml + printing result in console
 */

public class WriteXML {
    public static void writeAsXml(List<Hotel> hotelList) throws JAXBException {
        // Extracting the necessary fields
        List<String> prices = hotelList.stream().map(Hotel::getPrice).collect(Collectors.toList());
        List<String> names = hotelList.stream().map(Hotel::getName).collect(Collectors.toList());
        List<String> addresses = hotelList.stream().map(h -> h.getAddress().getAddressLine()).collect(Collectors.toList());

        // Creating main Lists class
        Lists lists = new Lists(new Name(names), new Price(prices), new Address(addresses));

        // Writing field from Java Objects to xml using JAXB lib
        JAXBContext jaxbContext = JAXBContext.newInstance(new Class[]{Lists.class}, null);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        File file = new File("src/main/resources/FilteredHotels.xml");
        jaxbMarshaller.marshal(lists, file);  // Writing in file
        jaxbMarshaller.marshal(lists, System.out); //  Printing in console
    }
}
