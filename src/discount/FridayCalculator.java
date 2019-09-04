package discount;

import com.hz.Product;
import com.hz.ShoppingCart;

public class FridayCalculator extends Calculator {
    @Override
    public double getTotalDiscount(ShoppingCart cart) {

        double totalProductPrice = 0;

        for(Product p : cart.getAll())
            totalProductPrice += p.getPrice();

        return totalProductPrice * .5;
    }
}
