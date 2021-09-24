package com.jrp.spring.repository;

import com.jrp.spring.model.Address;
import org.springframework.stereotype.Repository;

@Repository("homeAddress")
public class HomeAddress implements AddressRepository {

    @Override
    public Address getAddress() {
        return new Address("MUM", "MH");
    }
}
