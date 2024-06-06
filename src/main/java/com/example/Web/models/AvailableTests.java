package com.example.Web.models;

import javax.persistence.*;
//открытые экспертом тесты для пользователя
@Entity
public class AvailableTests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Tests tests;

    public AvailableTests(User user, Tests tests) {
        this.user = user;
        this.tests = tests;
    }

    public AvailableTests() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tests getTests() {
        return tests;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }
}
