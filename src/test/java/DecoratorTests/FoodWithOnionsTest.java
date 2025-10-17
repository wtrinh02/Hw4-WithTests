package DecoratorTests;

import Decorator.Burger;
import Decorator.FoodWithOnions;
import Decorator.Fries;
import Decorator.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodWithOnionsTest {
    @Test
    public void testOnionsBurgerName() {
        Burger burger = new Burger();
        FoodWithOnions foodWithOnions = new FoodWithOnions(burger);
        String actual = foodWithOnions.name();
        String expected = "Burger with Onions";
        assertEquals(expected, actual);
    }
    @Test
    public void testFriesWithOnionsName() {
        Fries fries = new Fries();
        FoodWithOnions foodWithOnions = new FoodWithOnions(fries);
        String actual = foodWithOnions.name();
        String expected = "Fries with Onions";
        assertEquals(expected, actual);
    }
    @Test
    public void testHotDogWithOnionsName() {
        HotDog hotDog = new HotDog();
        FoodWithOnions foodWithOnions = new FoodWithOnions(hotDog);
        String actual = foodWithOnions.name();
        String expected = "Hot Dog with Onions";
        assertEquals(expected, actual);
    }

    @Test
    public void testOnionsBurgerPrice() {
        Burger burger = new Burger();
        FoodWithOnions foodWithOnions = new FoodWithOnions(burger);
        double expected = 6.0;
        double actual = foodWithOnions.cost();
        assertEquals(expected, actual);
    }
    @Test
    public void testFriesWithOnionsPrice() {
        Fries fries = new Fries();
        FoodWithOnions foodWithOnions = new FoodWithOnions(fries);
        double expected = 4.0;
        double actual = foodWithOnions.cost();
        assertEquals(expected, actual);
    }
    @Test
    public void testHotDogWithOnionsPrice() {
        HotDog hotDog = new HotDog();
        FoodWithOnions foodWithOnions = new FoodWithOnions(hotDog);
        double expected = 5.0;
        double actual = foodWithOnions.cost();
        assertEquals(expected, actual);
    }
}
