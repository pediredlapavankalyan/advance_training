package com.imaginnovate.ProjectManager.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table
public class List {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int boardId;
    private int createdUser;

    @ManyToOne
    @JoinColumn(name = "createdUser",referencedColumnName = "id",updatable = false,insertable = false)
    private User listCreator;

    @ManyToOne
    @JoinColumn(name = "boardId",referencedColumnName = "id",updatable = false,insertable = false)
    private Board board;

    @OneToMany(mappedBy = "list")
    private Set<Card> cards = new LinkedHashSet<>();


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

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getCreated_user() {
        return createdUser;
    }

    public void setCreated_user(int created_user) {
        this.createdUser = created_user;
    }
}
