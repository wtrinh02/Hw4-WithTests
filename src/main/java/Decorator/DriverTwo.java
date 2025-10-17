package Decorator;

public class DriverTwo {
 
    public static void main(String args[]){
        
        //Food Item Combos
        Burger burger = new Burger();
        FoodWithCheese cheeseburger = new FoodWithCheese(burger);
        FoodWithKetchup ketchupBurger = new FoodWithKetchup(burger);
        FoodWithOnions burgerWithOnions = new FoodWithOnions(burger);
        HotDog hotDog = new HotDog();
        FoodWithCheese hotdogWithCheese = new FoodWithCheese(hotDog);
        FoodWithKetchup hotdogWithKetchup = new FoodWithKetchup(hotDog);
        FoodWithOnions hotdogWithOnions = new FoodWithOnions(hotDog);
        Fries fries = new Fries();
        FoodWithKetchup friesWithKetchup = new FoodWithKetchup(fries);
        FoodWithCheese friesWithCheese = new FoodWithCheese(fries);
        FoodWithOnions friesWithOnions = new FoodWithOnions(fries);


        //1st Order
        Order order = new Order();

        order.addToOrder(cheeseburger);
        order.addToOrder(burger);
        order.addToOrder(hotdogWithOnions);
        order.addToOrder(friesWithOnions);
        Customer Bob = new Customer(order);

        order.listOrder();
        Bob.addLoyalty();
        double totalCost = order.calculateCost();

     
        System.out.println("Total Meal Cost is $" + totalCost);
        Bob.applyLoyaltyBonus(totalCost);

        System.out.println("----------------------------------------------");
        
        //2nd Order

        order.createNewOrder();

        order.addToOrder(hotDog);
        order.addToOrder(friesWithKetchup);
        order.addToOrder(ketchupBurger);

        Bob.addLoyalty();
        order.listOrder();
        totalCost = order.calculateCost();

        System.out.println("Total Meal Cost is $" + totalCost);
        Bob.applyLoyaltyBonus(totalCost);

        System.out.println("----------------------------------------------");
        
        //3rd Order

        order.createNewOrder();

        order.addToOrder(burgerWithOnions);
        order.addToOrder(hotdogWithCheese);
        order.addToOrder(hotdogWithKetchup);
        order.addToOrder(friesWithCheese);

        Bob.addLoyalty();
        order.listOrder();
        totalCost = order.calculateCost();

        System.out.println("Total Meal Cost is $" + totalCost);
        Bob.applyLoyaltyBonus(totalCost);
    }

}
