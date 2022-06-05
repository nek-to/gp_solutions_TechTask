package com;

import com.filter.Filtration;
import com.models.Hotel;
import com.writingXml.WriteXML;

import javax.xml.bind.JAXBException;
import java.util.List;

public class RunProgram {
    public static void main(String[] args) throws JAXBException {
        List<Hotel> hotelList = Filtration.filtrationMethod();
        WriteXML.writeAsXml(hotelList);
    }
}
