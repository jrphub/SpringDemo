package com.jrp.spring.repository;

import com.jrp.spring.model.Speaker;

import javax.annotation.PostConstruct;
import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();

    @PostConstruct
    default void init() {
        System.out.println("post construct: " + this.getClass().getSimpleName());
    }
}
