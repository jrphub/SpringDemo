package com.jrp.spring.repository;

import com.jrp.spring.model.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Value("#{ T(java.lang.Math).random() * 100}")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("jyoti");
        speaker.setLastName("pattnaik");
        speaker.setSeedNum(seedNum);

        speakers.add(speaker);

        return speakers;
    }
}
