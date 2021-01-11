package ru.rusya.models;

public class Merchant {
    private int id;
    private String name;
    private Service parent;

    public Merchant(int id, String name, Service parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }

    public Merchant() {
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

    public Service getParent() {
        return parent;
    }

    public void setParent(Service parent) {
        this.parent = parent;
    }
}
