package Decorator;

import java.util.ArrayList;

public class Order {
    
   private ArrayList<Food> order;

    public Order(){
        order =  new ArrayList<>();
    }

    public void addToOrder(Food fooditem){
        order.add(fooditem);
    }

    public void listOrder(){

        String totalOrder = "Your order is ";

        for (Food item : order){
            totalOrder += item.name() + ", ";
        }
        totalOrder = totalOrder.replaceAll(", $", "");
        totalOrder +=  ".";
        System.out.println(totalOrder);
    }

    public double calculateCost(){
        double total = 0;
        for (Food item : order){
            total += item.cost();
        }
        return total;
    }

    public int getOrderSize(){
        return order.size();
    }

    public void createNewOrder(){
        order.clear();
    }
}
