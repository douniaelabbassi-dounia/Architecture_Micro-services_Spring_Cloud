package org.sid.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.sid.billingservice.model.Product;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private double quantity;
    private double price;
    private long productID;
    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Bill bill;
    @Transient
    private Product product;
    @Transient
    private String productName;
}
