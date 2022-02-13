package neuefische.friday.week2;

import java.util.HashMap;

public class Order {

    String id;
    private HashMap<String,Product> products;

    public Order(HashMap<String, Product> products) {
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }


}
