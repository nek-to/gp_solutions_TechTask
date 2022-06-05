package com.models;

import java.util.List;


/**
 *   Main model from Hotels.xml
 */

public class Hotels {
    private List<Hotel> hotelsList;

    public List<Hotel> getHotelList() {
        return hotelsList;
    }

    public void setHotelsList(List<Hotel> hotelList) {
        this.hotelsList = hotelList;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "hotelList=" + hotelsList +
                '}';
    }
}
