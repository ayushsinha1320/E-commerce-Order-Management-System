package ECOMS;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> productList;

    public Order(){
        productList = new ArrayList<>();
    }


    public void add_product(Product product){
        productList.add(product);
    }
    public List<Product> get_products() {
        return productList;
    }
}
