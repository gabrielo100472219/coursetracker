package com.gabrielo.coursetracker.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private int orderIndex;

    @Column
    private int estimatedHours;

    @ManyToOne
    @JoinColumn(name = "learningItemId")
    private LearningItem learningItem;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Progress> progresses;
}
