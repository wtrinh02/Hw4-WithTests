package DecoratorTests;

import Decorator.Burger;
import Decorator.Fries;
import Decorator.Order;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    private final Order order = new Order();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testInitialOrderSize(){
        int expected = 0;
        int actual = order.getOrderSize();
        assertEquals(expected, actual);

    }

    @Test
    public void testAddToOrder(){
        Burger burger = new Burger();
        order.addToOrder(burger);
        int expected = 1;
        int actual = order.getOrderSize();
        assertEquals(expected, actual);

    }

    @Test
    public void testOrderList(){
        Burger burger = new Burger();
        order.addToOrder(burger);
        String expected = "Your order is Burger.";;
        order.listOrder();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testOrderPrice(){
        Burger burger = new Burger();
        Fries fries = new Fries();
        order.addToOrder(burger);
        order.addToOrder(fries);
        double expected = 9.0;
        double actual = order.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateNewOrder(){
        Burger burger = new Burger();
        order.addToOrder(burger);
        order.createNewOrder();
        int expected = 0;
        int actual = order.getOrderSize();
        assertEquals(expected, actual);
    }

}
