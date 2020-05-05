/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author Tidal
 */
public class OrderItemDataManager {
    private ArrayList<OrderItem> dataStore;
    
    public OrderItemDataManager() {
    this.dataStore = new ArrayList<OrderItem>();
    }
    
    public ArrayList<OrderItem> getAll() {
    return dataStore;
    }
    
    public void create(OrderItem orderItemToCreate){
    
        this.dataStore.add(orderItemToCreate);
    }
    
}
