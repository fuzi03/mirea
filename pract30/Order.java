package pract30;

import java.awt.*;

public interface Order {
    boolean add(MenuItem item);
    String itemsnames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem itemName);
    MenuItem getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeAll(String itemName);
    int removeAll(MenuItem item);
    MenuItem sortedItemsByCostDesc();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
