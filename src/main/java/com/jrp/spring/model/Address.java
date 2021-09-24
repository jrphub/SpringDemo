package com.jrp.spring.model;

import lombok.Data;

@Data
public class Address {

    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
