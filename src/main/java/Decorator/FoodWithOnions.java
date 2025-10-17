package Decorator;

public class FoodWithOnions implements Food{

    private Food foodItem;
    public FoodWithOnions(Food food){
        this.foodItem = food;
    }
    public double cost() {
        return foodItem.cost() + 0.5;
    }

    public String name (){
        return foodItem.name() + " with Onions";
    }
    
}
