
import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataAccess.CustomerDataManager;
import DataAccess.OrderDataManager;
import DataAccess.OrderItemDataManager;
import DataAccess.ProductDataManager;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tidal
 */
public class OrderSystem {
    public static void main(String[] args) {
      //This is creating all of my data managing classes
        CustomerDataManager customerDM = new CustomerDataManager();
        OrderDataManager orderDM = new OrderDataManager();
        OrderItemDataManager orderItemDM = new OrderItemDataManager();
        ProductDataManager productDM = new ProductDataManager();
        
        //This is all the products offered by my establishment
         Product hamburger = new Product(1, "Beef Hamburger", 100, 2.50);
         productDM.create(hamburger);
         
         Product chickenSandwhich = new Product(2, "Breaded Chicken Sandwhich", 120, 2.75);
         productDM.create(chickenSandwhich);
         
         Product salad = new Product(3, "Iceberg Salad", 50, 4.50);
         productDM.create(salad);
         
         Product soda = new Product(4, "Large Coke", 110, 1.00);
        productDM.create(soda);
        
        //This is the First Customer and his Order
        Customer myCustomer = new Customer(1, "Bob", "Smith", "123-456-7890");
        customerDM.create(myCustomer);
        
        Order myOrder1 = new Order(1, 1, "5-5-20");
        orderDM.create(myOrder1);
        
        OrderItem orderItem1 = new OrderItem(1, 2, 1, "Beef Hamburger", 2, 5.00);
        orderItemDM.create(orderItem1);
        OrderItem orderItem2 = new OrderItem(1, 2, 4, "Large Coke", 1, 1.00);
        orderItemDM.create(orderItem2);
        
        
        //This is the Second Customer and his Order
         Customer myCustomer2 = new Customer(1, "John", "Doe", "098-765-4321");
         customerDM.create(myCustomer2);

         Order myOrder2= new Order(2, 2, "5-5-20");
         orderDM.create(myOrder2);

         OrderItem orderItem3 = new OrderItem(2, 1, 2, "Breaded Chicken Sandwhich", 3, 8.25);
         orderItemDM.create(orderItem3);
         OrderItem orderItem4 = new OrderItem(2, 1, 4, "Large Coke", 2, 2.00);
         orderItemDM.create(orderItem4);
         
         
         
         //This is the Third Customer and her Order
         Customer myCustomer3 = new Customer(1, "Jane", "Doe", "456-123-7894");
          customerDM.create(myCustomer3);

         Order myOrder3 = new Order(3, 3, "5-5-20");
         orderDM.create(myOrder3);

         OrderItem orderItem5 = new OrderItem(3, 3, 3, "Iceberg Salad", 1, 4.50);
         orderItemDM.create(orderItem5);
         OrderItem orderItem6 = new OrderItem(3, 3, 4, "Large Coke", 1, 1.00);
         orderItemDM.create(orderItem6);
         
         //Read everything from database and print it out
         ArrayList<Customer> customersFromDatabase = customerDM.getAll();
         for(Customer dbCustomer : customersFromDatabase) {
         System.out.println(dbCustomer);
         }
            
         ArrayList<Order> ordersFromDatabase = orderDM.getAll();
         for(Order dbOrder : ordersFromDatabase) {
         System.out.println(dbOrder);
         }
         
         ArrayList<OrderItem> orderItemsFromDatabase = orderItemDM.getAll();
         for(OrderItem dbOrderItem : orderItemsFromDatabase) {
         System.out.println(dbOrderItem);
         }
        
         ArrayList<Product> productsFromDatabase = productDM.getAll();
         for(Product dbProduct : productsFromDatabase) {
         System.out.println(dbProduct);
         }
         
         //Read Everything out to the console different Format
         System.out.println("Customer 1");
         System.out.println(myCustomer);
         System.out.println("Ordered");
         System.out.println(myOrder1);
         System.out.println("Order 1 Contained");
         System.out.println(orderItem1);
         System.out.println(orderItem2);
         
         System.out.println("Customer 2");
         System.out.println(myCustomer2);
         System.out.println("Ordered");
         System.out.println(myOrder2);
         System.out.println("Order 2 Contained");
         System.out.println(orderItem3);
         System.out.println(orderItem4);
         
        System.out.println("Customer 3");
         System.out.println(myCustomer3);
         System.out.println("Ordered");
         System.out.println(myOrder3);
         System.out.println("Order 3 Contained");
         System.out.println(orderItem5);
         System.out.println(orderItem6);
    }
    
    
}
