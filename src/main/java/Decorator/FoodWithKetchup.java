package Decorator;

public class FoodWithKetchup implements Food{
    
    private Food foodItem;
    public FoodWithKetchup(Food food){
        this.foodItem = food;
    }

    public double cost(){
        return foodItem.cost() + 0.1;
    }

    public String name (){
        return foodItem.name() + " with Ketchup";
    }
}
