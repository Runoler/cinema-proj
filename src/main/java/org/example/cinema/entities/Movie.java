package org.example.cinema.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.cinema.enums.Genre;

import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String country;
    private Genre genre;
    private String description;
    private String posterImagePath;
    private int duration;
    private double budget;
    private double rate;
    @OneToMany(mappedBy = "movie")
    private Set<Review> reviews;
    @OneToMany(mappedBy = "movie")
    private Set<MovieSession> movieSessions;
}
