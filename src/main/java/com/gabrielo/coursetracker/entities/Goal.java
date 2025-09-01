package com.gabrielo.coursetracker.entities;

import jakarta.persistence.*;

@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column
    private String weekStart;

    @Column
    private int targetHours;

    @Column
    private String notes;
}
