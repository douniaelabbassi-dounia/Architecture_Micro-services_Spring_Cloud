package org.sid.billingservice.entities;

import jakarta.persistence.*;

import java.util.Collection;
import lombok.*;
import org.hibernate.sql.ast.tree.expression.Collation;
import org.sid.billingservice.model.Customer;

import java.util.Collection;
import java.util.Date;
@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
    private Long customerID;
    @Transient
    private Customer customer;

}
