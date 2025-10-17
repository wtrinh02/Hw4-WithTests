package DecoratorTests;

import Decorator.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotDogTest {
    @Test
    public void testName(){
        HotDog hotDog = new HotDog();
        assertEquals("Hot Dog",hotDog.name());

    }

    @Test
    public void testPrice(){
        HotDog hotDog = new HotDog();
        double expected = 4.5;
        double actual = hotDog.cost();

        assertEquals(expected,actual);
    }
}
