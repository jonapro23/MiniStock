package main.java.com.example.ministock.domain.model;

public class Product {
    private String description;
    private double price;
    private String name;
    private int quantity;
    private long id;

    public Product(String description, double price, String name, int quantity, long id) {
        this.description = description;
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getId() {
        return id;
    }
}