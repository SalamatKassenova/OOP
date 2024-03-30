package lecture4;

import java.util.*;

//Order class using GENERICS
public class Order<T extends Product> { //T must be a subtype of Product
    private List<T> items = new ArrayList<>(); //List of products in the order
    
    //Method to add a product to the order
    public void addItem(T item){
        items.add(item);
    }
    
    //calculate the total price of the order
    public double calculateTotalPrice(){
        double totalPrice = 0.0;
        for (T item:items){
            totalPrice += item.getPrice(); 
        }
        return totalPrice;
    }

    //Display the products in the order and their prices
    public void displayOrderItems(){
        for (T item:items){
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
    }
}
