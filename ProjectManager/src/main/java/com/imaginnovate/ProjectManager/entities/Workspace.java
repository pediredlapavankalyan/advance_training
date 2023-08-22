package com.imaginnovate.ProjectManager.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int createdUser;

    @ManyToOne
    @JoinColumn(name ="createdUser",referencedColumnName = "id" ,insertable = false,updatable = false)
    private User creator;

    @OneToMany(mappedBy = "workspace")
    private Set<User> workspaceMembers = new LinkedHashSet<>();



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

    public int getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(int createdUser) {
        this.createdUser = createdUser;
    }
}
