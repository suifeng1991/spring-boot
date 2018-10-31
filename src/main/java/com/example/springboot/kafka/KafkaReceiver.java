package com.example.springboot.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {
    @KafkaListener(topicPartitions = {@TopicPartition(topic = "renliansong",partitions = {"2"})})
    public void receiver(ConsumerRecord<?,?> record){
        logger.info("receive message ---------"+record.value());

    }
    static private Logger logger = LoggerFactory.getLogger(KafkaListener.class);

}
