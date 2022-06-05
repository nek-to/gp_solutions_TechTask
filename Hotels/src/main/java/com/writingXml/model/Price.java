package com.writingXml.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


/**
 *   Adding class to create an output model using JAXB lib
 */


public class Price {
    @XmlElement(name = "Price")
    private List<String> value;

    public Price() {
    }

    public Price(List<String> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value='" + value + '\'' +
                '}';
    }
}
