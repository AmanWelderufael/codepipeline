package com.example.TManagement.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "task_name")
    private String tastName;
    @Column(nullable = false, name = "description")
    private String description;

    public Task(long l, String task1, String s) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTastName() {
        return tastName;
    }

    public void setTastName(String tastName) {
        this.tastName = tastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
