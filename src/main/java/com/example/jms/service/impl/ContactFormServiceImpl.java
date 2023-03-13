package com.example.jms.service.impl;

import com.example.jms.dto.ContactFromDto;
import com.example.jms.entity.ContactFormEntity;
import com.example.jms.kafka.KafkaConsumer;
import com.example.jms.kafka.KafkaProducer;
import com.example.jms.repository.ContactFormRepository;
import com.example.jms.service.ContactFormService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ContactFormServiceImpl implements ContactFormService {

    private final ContactFormRepository repository;
    private final KafkaProducer kafkaProducer;
    private final KafkaConsumer kafkaConsumer;

    @Override
    public void createForm(ContactFromDto dto) {
        dto.setDate(LocalDateTime.now());
        ContactFormEntity entity=new ContactFormEntity();

        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setComplaint(dto.getComplaint());
        entity.setDate(dto.getDate());
        repository.save(entity);
        kafkaProducer.sendMessage(dto.toString());

    }


}
