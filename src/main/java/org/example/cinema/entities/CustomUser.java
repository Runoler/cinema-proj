package org.example.cinema.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.cinema.enums.Role;

import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class CustomUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter(AccessLevel.NONE)
    private String name;
    private String password;
    private Role role;
    private String email;
    @OneToMany(mappedBy = "customUser")
    private Set<Review> reviews;
    @OneToMany(mappedBy = "customUser")
    private Set<Ticket> tickets;
    @OneToMany(mappedBy = "customUser")
    private Set<PaymentReceipt> paymentReceipts;
}
