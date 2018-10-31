package com.example.springboot.kafka;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaSend {
    static private Logger logger = LoggerFactory.getLogger(KafkaSend.class);
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/send1")
    public String send1() {
        kafkaTemplate.send("renliansong", 1, "hello suifeng", JSON.toJSON(new Stu(2,"ren")).toString());
        return "ok";
    }
    @RequestMapping("/send2") 
    public String send2() {
        kafkaTemplate.send("renliansong", 2, "hello suifeng",JSON.toJSON(new Stu(2,"renasdf")).toString());
        return "ok";
    }
}
