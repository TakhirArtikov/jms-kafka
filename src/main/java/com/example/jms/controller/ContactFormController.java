package com.example.jms.controller;

import com.example.jms.dto.ContactFromDto;
import com.example.jms.service.ContactFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/contact-form")
public class ContactFormController {

    private final ContactFormService service;

    @PostMapping
    public void createForm(@RequestBody ContactFromDto dto){

        service.createForm(dto);

    }
}
