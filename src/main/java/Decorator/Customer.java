package Decorator;

public class Customer {
    
    private Order order;
    private int loyalty;

    public Customer(Order order){
        this.order = order;
        this.loyalty = 0;
    }

    public int getLoyalty(){
        return this.loyalty;
    }

    public void addLoyalty(){
        if(order.getOrderSize() >= 2){
            loyalty += 1;
        }

    }



    public void applyLoyaltyBonus(double price){
        
        if (loyalty >= 3 ){
            price = price * 0.9;
            System.out.printf("Price After Loyalty Discount is: $%.2f\n" , price);
        }
        else{
            System.out.println("Loyalty Discount Not Available!");
        }
        
        
    }
}
