package DecoratorTests;

import Decorator.Fries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FriesTest {
    @Test
    public void testName(){
        Fries fries = new Fries();
        assertEquals("Fries",fries.name());

    }

    @Test
    public void testPrice(){
        Fries fries = new Fries();
        double expected = 3.5;
        double actual = fries.cost();

        assertEquals(expected,actual);
    }
}
