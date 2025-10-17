package DecoratorTests;

import Decorator.Burger;
import Decorator.FoodWithCheese;
import Decorator.Fries;
import Decorator.HotDog;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FoodWithCheeseTest {

    @Test
    public void testCheeseBurgerName() {
        Burger burger = new Burger();
        FoodWithCheese foodWithCheese = new FoodWithCheese(burger);
        String actual = foodWithCheese.name();
        String expected = "Burger with Cheese";
        assertEquals(expected, actual);
    }
    @Test
    public void testFriesWithCheeseName() {
        Fries fries = new Fries();
        FoodWithCheese foodWithCheese = new FoodWithCheese(fries);
        String actual = foodWithCheese.name();
        String expected = "Fries with Cheese";
        assertEquals(expected, actual);
    }
    @Test
    public void testHotDogWithCheeseName() {
        HotDog hotDog = new HotDog();
        FoodWithCheese foodWithCheese = new FoodWithCheese(hotDog);
        String actual = foodWithCheese.name();
        String expected = "Hot Dog with Cheese";
        assertEquals(expected, actual);
    }

    @Test
    public void testCheeseBurgerPrice() {
        Burger burger = new Burger();
        FoodWithCheese foodWithCheese = new FoodWithCheese(burger);
        double expected = 6.5;
        double actual = foodWithCheese.cost();
        assertEquals(expected, actual);
    }
    @Test
    public void testFriesWithCheesePrice() {
        Fries fries = new Fries();
        FoodWithCheese foodWithCheese = new FoodWithCheese(fries);
        double expected = 4.5;
        double actual = foodWithCheese.cost();
        assertEquals(expected, actual);
    }
    @Test
    public void testHotDogWithCheesePrice() {
        HotDog hotDog = new HotDog();
        FoodWithCheese foodWithCheese = new FoodWithCheese(hotDog);
        double expected = 5.5;
        double actual = foodWithCheese.cost();
        assertEquals(expected, actual);
    }
}
