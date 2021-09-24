package com.jrp.spring.service;

import com.jrp.spring.model.Speaker;
import com.jrp.spring.repository.AddressRepository;
import com.jrp.spring.repository.SpeakerRepository;
import com.jrp.spring.util.Roles;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    //we can inject SpeakerRepository in various way like setter or constructor injection
    private SpeakerRepository repository;

    private Roles roles;

    @Autowired
    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    @Autowired
    @Qualifier("confAddress")
    private AddressRepository addressRepo;
    /*
    NoUniqueBeanDefinitionException:
    No qualifying bean of type 'com.jrp.spring.repository.AddressRepository' available:
    expected single matching bean but found 2: confAddress,homeAddress
    To resolve this, we need to use Qualifier
     */

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("constructor injection");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        System.out.println("Position : " + roles.getPosition());
        System.out.println("Address :" + addressRepo.getAddress());
        return repository.findAll();
    }

    //optional as we are using constructor injection
    public void setRepository(SpeakerRepository repository) {
        System.out.println("setter injection");
        this.repository = repository;
    }

}
