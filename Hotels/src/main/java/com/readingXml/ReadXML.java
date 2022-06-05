package com.readingXml;

import com.convertation.ConvertXMLInObjects;
import com.models.Hotel;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import java.io.IOException;
import java.util.List;


/**
 *   Reader class by SAX lib
 */

public class ReadXML {
    public List<Hotel> readingXml(){
        SAXParserFactory factory = SAXParserFactory.newInstance();
        List<Hotel> result = null;

        try (InputStream in = getXMLFileAsStream()) {
            SAXParser saxParser = factory.newSAXParser();

            ConvertXMLInObjects handler = new ConvertXMLInObjects();

            saxParser.parse(in, handler);

            result = handler.getResult();
        } catch (IOException | ParserConfigurationException |
                 SAXException e) {
            e.printStackTrace();
        }

        return result;
    }

    private static InputStream getXMLFileAsStream() {
        return ReadXML.class.getClassLoader().getResourceAsStream("Hotels.xml");
    }
}
