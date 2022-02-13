package neuefische.friday.week2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {


    @Test
    void addProductIsInProductRepo(){

        Product product = new Product("1", "Schuhe");
        HashMap<String, Product> map = new HashMap<>();
//        map.put(product.getId(), product);              //Diese Zeile ist total überflüssig
        ProductRepo products = new ProductRepo(map);
        OrderRepo orders = new OrderRepo();

        ShopService newShop = new ShopService(orders, products);
        newShop.addProduct(product);
        var result = newShop.getProduct("1");
        assertEquals(product, result);

    }

}