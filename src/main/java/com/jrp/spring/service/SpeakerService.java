package com.jrp.spring.service;

import com.jrp.spring.model.Speaker;

import javax.annotation.PostConstruct;
import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();

    //Spring 5 feature : default Method
    @PostConstruct
    default void init() {
        System.out.println("post construct: " + this.getClass().getSimpleName());
    }
}
