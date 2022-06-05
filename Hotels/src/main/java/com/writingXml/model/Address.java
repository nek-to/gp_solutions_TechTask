package com.writingXml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *   Adding class to create an output model using JAXB lib
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
    @XmlElement(name = "Address")
    private List<String> values;

    public Address() {
    }

    public Address(List<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + values + '\'' +
                '}';
    }
}
