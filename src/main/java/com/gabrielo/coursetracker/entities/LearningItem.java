package com.gabrielo.coursetracker.entities;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Module> modules;
}
