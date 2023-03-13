package com.example.jms.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class ContactFromDto {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String complaint;
    private LocalDateTime date;

    @Override
    public String toString() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return
                "Name: " + name + '\n' +
                "Email: " + email + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Complaint: " + complaint + '\n' +
                "Date: " + date.format(myFormatObj);

    }
}
