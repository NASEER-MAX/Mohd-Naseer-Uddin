package com.naseer.kafkaProject.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class kafkaproducerConfig {

    @Bean
    public NewTopic createTopic(){
        return new NewTopic("naseerIsthebest", 5, (short) 1);
    }

}
