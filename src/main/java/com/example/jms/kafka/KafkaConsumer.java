package com.example.jms.kafka;

import com.example.jms.email.EmailSender;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    private final EmailSender emailSender;

    @KafkaListener(topics = "complaint",groupId = "complaint")
    public void consume(String message){
    log.info(String.format("Message consumed %s",message));
    emailSender.sendEmail("tahir_artikov@mail.ru","Complain Letter",message);
    }
}
