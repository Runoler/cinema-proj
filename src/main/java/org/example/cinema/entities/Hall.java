package org.example.cinema.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.cinema.enums.HallType;

import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int capacity;
    private HallType hallType;
    private String description;
    @OneToMany(mappedBy = "hall")
    private Set<MovieSession> movieSessions;
}
