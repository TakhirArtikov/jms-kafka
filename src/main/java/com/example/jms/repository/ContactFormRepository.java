package com.example.jms.repository;

import com.example.jms.entity.ContactFormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactFormRepository extends JpaRepository<ContactFormEntity,Long> {
}
