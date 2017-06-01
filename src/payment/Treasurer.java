package payment;

import order.Order;
import order.Product;

public class Treasurer {
    Order order;
    Campaign campaign;

    public Treasurer(Order order, Campaign campaign) {
        this.order = order;
        this.campaign = campaign;
    }

    public int getTotal(){

        return this.order.getProductList().stream()
                .mapToInt(Product::getPrice)
                .sum();
    }

}
