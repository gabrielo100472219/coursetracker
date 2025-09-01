package com.gabrielo.coursetracker.entities;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class LearningItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LearningItemType type;

    @Column(nullable = false)
    private String title;

    @Column
    private String provider;

    @Column
    private String url;

    @Column
    private int estimatedHours;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp createdAt;
}
