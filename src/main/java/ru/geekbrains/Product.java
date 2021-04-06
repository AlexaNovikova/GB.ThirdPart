package ru.geekbrains;

public class Product {
    private int id;
    private String name;
    private double coast;

    public Product(int id, String name, double coast) {
        this.id = id;
        this.name = name;
        this.coast = coast;
    }

    @Override
    public String toString() {
        return
                id +
                " name: " + name  +
                " coast:" + coast;
    }

    public String getName() {
        return name;
    }

    public double getCoast() {
        return coast;
    }

    public int getId() {
        return id;
    }
}
