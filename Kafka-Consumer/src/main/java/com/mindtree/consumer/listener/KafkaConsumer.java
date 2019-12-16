package com.mindtree.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.mindtree.consumer.model.User;

@Service
public class KafkaConsumer {

   /* @KafkaListener(topics = "win", group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }*/
    
    @KafkaListener(topics = "win", group = "group_json", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(String brokerMessage) {
        System.out.println("message: " + brokerMessage.toString());
    }
}
