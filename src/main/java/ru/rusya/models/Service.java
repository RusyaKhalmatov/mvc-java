package ru.rusya.models;

public class Service {
    private int id;
    private String name;

    public Service(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Service() {
    }

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
}
