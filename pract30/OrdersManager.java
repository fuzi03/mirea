package pract30;

import java.awt.MenuItem;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
