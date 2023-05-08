package org.sid.billingservice.model;

import lombok.*;

@Data
public class Product {
    private Long id;
    private String name;
    private double price;
    private double quantity;
}
