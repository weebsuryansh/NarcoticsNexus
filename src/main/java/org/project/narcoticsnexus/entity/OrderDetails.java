package org.project.narcoticsnexus.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Customer customer;
    private int quantity;
    private Date dateOfOrder;
}
