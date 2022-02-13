package neuefische.friday.week2;

import java.util.Collection;
import java.util.HashMap;

public class OrderRepo {

    private HashMap<String, Order> orders;

    public OrderRepo() {
        orders = new HashMap<>();
    }

    public Collection<Order> list() {
        return orders.values();
    }

    public Order get(String theorder) {
        return orders.get(theorder);
    }

    public void add(Order newOrder) {
        orders.put(newOrder.getId(), newOrder);
    }

}
