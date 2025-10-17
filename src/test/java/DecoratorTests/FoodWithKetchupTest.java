package DecoratorTests;

import Decorator.Burger;
import Decorator.FoodWithKetchup;
import Decorator.Fries;
import Decorator.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodWithKetchupTest {
    @Test
    public void testKetchupBurgerName() {
        Burger burger = new Burger();
        FoodWithKetchup foodWithKetchup = new FoodWithKetchup(burger);
        String actual = foodWithKetchup.name();
        String expected = "Burger with Ketchup";
        assertEquals(expected, actual);
    }
    @Test
    public void testFriesWithKetchupName() {
        Fries fries = new Fries();
        FoodWithKetchup foodWithKetchup = new FoodWithKetchup(fries);
        String actual = foodWithKetchup.name();
        String expected = "Fries with Ketchup";
        assertEquals(expected, actual);
    }
    @Test
    public void testHotDogWithKetchupName() {
        HotDog hotDog = new HotDog();
        FoodWithKetchup foodWithKetchup = new FoodWithKetchup(hotDog);
        String actual = foodWithKetchup.name();
        String expected = "Hot Dog with Ketchup";
        assertEquals(expected, actual);
    }

    @Test
    public void testKetchupBurgerPrice() {
        Burger burger = new Burger();
        FoodWithKetchup foodWithKetchup = new FoodWithKetchup(burger);
        double expected = 5.6;
        double actual = foodWithKetchup.cost();
        assertEquals(expected, actual);
    }
    @Test
    public void testFriesWithKetchupPrice() {
        Fries fries = new Fries();
        FoodWithKetchup foodWithKetchup = new FoodWithKetchup(fries);
        double expected = 3.6;
        double actual = foodWithKetchup.cost();
        assertEquals(expected, actual);
    }
    @Test
    public void testHotDogWithKetchupPrice() {
        HotDog hotDog = new HotDog();
        FoodWithKetchup foodWithKetchup = new FoodWithKetchup(hotDog);
        double expected = 4.6;
        double actual = foodWithKetchup.cost();
        assertEquals(expected, actual);
    }
}
