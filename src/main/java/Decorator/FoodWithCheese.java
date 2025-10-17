package Decorator;

public class FoodWithCheese implements Food{
    private Food foodItem;
    public FoodWithCheese(Food food){
        this.foodItem = food;
    }

    public double cost(){
        return foodItem.cost() + 1.0;
    }
    public String name (){
        return foodItem.name() + " with Cheese";
    }
}
