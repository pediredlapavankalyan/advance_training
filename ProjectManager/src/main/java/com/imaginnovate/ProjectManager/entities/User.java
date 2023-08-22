package com.imaginnovate.ProjectManager.entities;

import jakarta.persistence.*;

import java.net.Proxy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table
public class User {
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    //mappings
    @OneToMany(mappedBy = "creator")
    private Set<Workspace> createdWorkspaces = new LinkedHashSet<>();

    @OneToMany(mappedBy = "boardCreator")
    private  Set<Board> boards = new LinkedHashSet<>();

    @OneToMany(mappedBy = "listCreator")
    private  Set<List> lists = new LinkedHashSet<>();
    @OneToMany(mappedBy = "activeUser")
    private Set<Workspace> activeWorkspaces = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cardCreator")
    private Set<Card> cards = new LinkedHashSet<>();

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }
}
