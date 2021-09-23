package com.jrp.spring.service;

import com.jrp.spring.model.Speaker;
import com.jrp.spring.repository.SpeakerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    //we can inject SpeakerRepository in various way like setter or constructor injection
    private SpeakerRepository repository;

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("constructor injection");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    //optional as we are using constructor injection
    public void setRepository(SpeakerRepository repository) {
        System.out.println("setter injection");
        this.repository = repository;
    }
}
