package com.jrp.spring.config;

import com.jrp.spring.util.Roles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.jrp.spring"})
public class AppConfig {

    /*@Bean("speakerService")
    public SpeakerService getSpeakerService() {

        //Constructor Injection
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        //setter injection
        //SpeakerServiceImpl service = new SpeakerServiceImpl();
        //service.setRepository(getSpeakerRepository());

        return service;
    }*/

    /*@Bean("speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }*/

    @Bean
    public Roles getRole() {
        return new Roles();
    }


}
