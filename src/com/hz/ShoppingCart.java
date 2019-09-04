package com.hz;

import java.util.ArrayList;
import java.util.Set;

public class ShoppingCart {

    private ArrayList<Product> _products;

    public ShoppingCart() {
        this._products = new ArrayList<>();
    }

    public void addToCart(Product product) {
        this._products.add(product);
    }

//    public void addToCart(Butter butter){
//        this._products.add(butter);
//    }
//    public void addToCart(AppleSyrup dinges) {
//        this._products.add(dinges);
//    }

    public Product[] getAll() {

        int size = this._products.size();
        return this._products.toArray(new Product[size]);
    }
}
