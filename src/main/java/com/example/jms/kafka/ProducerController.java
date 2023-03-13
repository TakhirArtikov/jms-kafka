package com.example.jms.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/kafka-producer")
@Slf4j
public class ProducerController {

    private KafkaProducer kafkaProducer;

    public ProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    //   localhost:8080/api/kafka-producer/publish?message=salom bollo
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){

        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to topic.");
    }
}
