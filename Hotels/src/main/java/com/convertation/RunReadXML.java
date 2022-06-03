package com.convertation;

import com.models.Hotel;
import com.models.Hotels;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import java.io.IOException;
import java.util.List;

public class RunReadXML {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();

        try (InputStream in = getXMLFileAsStream()) {

            SAXParser saxParser = factory.newSAXParser();

            ConvertXMLInObjects handler = new ConvertXMLInObjects();

            saxParser.parse(in, handler);

            List<Hotel> result = handler.getResult();
            result.forEach(System.out::println);

        } catch (IOException |ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
    }

    private static InputStream getXMLFileAsStream() {
        return RunReadXML.class.getClassLoader().getResourceAsStream("Hotels.xml");
    }
}
