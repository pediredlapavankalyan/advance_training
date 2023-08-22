package com.imaginnovate.ProjectManager.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int createdUserId;

    @ManyToOne
    @JoinColumn(name = "createdUserId",referencedColumnName = "id",updatable = false,insertable = false)
    private User boardCreator;

    @OneToMany(mappedBy = "board")
    Set<List> lists = new LinkedHashSet<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }
}
