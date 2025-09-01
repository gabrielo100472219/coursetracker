package com.gabrielo.coursetracker.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private StatusType status;

    @Column
    private int percent;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp finishedAt;

    @ManyToOne
    @JoinColumn(name = "moduleId")
    private Module module;
}
