package com.hz;

public class Product {

    private double _price;
    private String _name;

    public Product(double price, String name) {

        _price = price;
        _name = name;
    }

    public double getPrice() {
        return _price;
    }

    public String getName() {
        return _name;
    }
}
