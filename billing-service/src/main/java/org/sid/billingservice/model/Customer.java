package org.sid.billingservice.model;

import jakarta.persistence.Entity;
import lombok.*;


@Data
public class Customer {
    private Long id;
    private String name;
    private String email;
}
