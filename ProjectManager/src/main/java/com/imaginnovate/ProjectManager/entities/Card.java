package com.imaginnovate.ProjectManager.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int listId;
    private int createdUser;

    @ManyToOne
    @JoinColumn(name = "listId",insertable = false,updatable = false)
    private List list;

    @ManyToOne
    @JoinColumn(name = "createdUser")
    private User cardCreator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }
}
