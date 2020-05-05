/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.Customer;
import BusinessLayer.Order;
import java.util.ArrayList;

/**
 *
 * @author Tidal
 */
public class OrderDataManager {
    private ArrayList<Order> dataStore;
    
    public OrderDataManager() {
    this.dataStore = new ArrayList<Order>();
    }
    
      public ArrayList<Order> getAll() {
            return dataStore;
    }
    
    public void create(Order orderToCreate) {
    
        this.dataStore.add(orderToCreate);
    }
    
}
