package neuefische.friday.week2;

import java.util.Collection;
import java.util.HashMap;

public class ProductRepo {

    private HashMap<String, Product> products;

    public ProductRepo(HashMap<String, Product> products) {
        this.products = products;
    }

    public Collection<Product> list(){
        return products.values();
    }
    //TODO Warum String?
    public Product get(String theid){
        return products.get(theid);
    }

    public void add(Product newProduct){
        products.put(newProduct.getId(), newProduct);
    }
}
