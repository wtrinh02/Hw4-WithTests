package Decorator;

public class Burger implements Food{
    
    public double cost(){

        return 5.5;
    }

    public String name (){
        return "Burger";
    }
}