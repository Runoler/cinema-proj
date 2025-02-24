package org.example.cinema.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int totalDiscount;
    private String description;
    private String expirationDate;
    @OneToMany(mappedBy = "discount")
    private Set<PaymentReceipt> paymentReceipts;
}
