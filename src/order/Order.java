package order;

import java.util.List;

public class Order {
    private UserId userId;

    private List<Product> productList;

    public Order(UserId userId, List<Product> productList) {
        this.userId = userId;
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }


}
