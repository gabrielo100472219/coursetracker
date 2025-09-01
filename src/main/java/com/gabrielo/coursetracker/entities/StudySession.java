package com.gabrielo.coursetracker.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class StudySession {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp startedAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp endedAt;

    @Column
    private int minutes;

    @Column
    private String notes;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
