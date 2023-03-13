package com.example.jms.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name = "contact_form")
public class ContactFormEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "complaint")
    private String complaint;

    @Column(name = "date")
    private LocalDateTime date;


}
