package com.hz;

import discount.*;

public class Main {

    public static void main(String[] args) {

        // 20.00h
        boolean isAfterEight = false; // no discount, ma, di, wo, do, za 50%
        boolean isFriday = true; // 50%
        boolean isMonday = true; // first product for free

        // butter 1.00
        Product butter = new Butter(1);
        // apple syrup 2.00
        Product appleSyrup = new AppleSyrup(2);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(butter);
        cart.addToCart(appleSyrup);


        Calculator calc;

        if(isFriday) {
            calc = new FridayCalculator();
        } else {
            calc = new DefaultCalculator();
        }


        double discount = calc.getTotalDiscount(cart);
//        if(isFriday) {
//
//            // calc 50% off
//            discount = 0; /// to be calculated
//        }
//        else {
//
//            if(isMonday) {
//
//                //discount += cart.getAll()
//            }
//            discount = (isAfterEight == true)
//
//                    // if true
//                    ? 0.0
//
//                    // if false
//                    : calc.getTotalDiscount(cart);
//        }

        System.out.
                println("Total discount: " + discount);
    }
}
