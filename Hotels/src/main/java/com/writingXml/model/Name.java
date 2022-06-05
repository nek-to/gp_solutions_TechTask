package com.writingXml.model;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;


/**
 *   Adding class to create an output model using JAXB lib
 */

public class Name {
    @XmlElement(name = "Name")
    private List<String> values;

    public Name() {
    }

    public Name(List<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Name{" +
                "value='" + values + '\'' +
                '}';
    }
}
