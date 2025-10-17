package DecoratorTests;

import Decorator.Burger;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BurgerTest {

    @Test
    public void testName(){
        Burger burger = new Burger();
        assertEquals("Burger",burger.name());

    }

    @Test
    public void testPrice(){
        Burger burger = new Burger();
        double expected = 5.5;
        double actual = burger.cost();

        assertEquals(expected,actual);
    }
}
