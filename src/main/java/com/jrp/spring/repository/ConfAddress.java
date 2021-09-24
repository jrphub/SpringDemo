package com.jrp.spring.repository;

import com.jrp.spring.model.Address;
import org.springframework.stereotype.Repository;

@Repository("confAddress")
public class ConfAddress implements AddressRepository {

    @Override
    public Address getAddress() {
        return new Address("BLR", "KA");
    }
}
