package org.example.cinema.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class PaymentReceipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CustomUser customUser;
    @OneToOne
    private Ticket ticket;
    private Date date;
    @ManyToOne
    private Discount discount;
    private double totalSum;
}
