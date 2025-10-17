package DecoratorTests;


import Decorator.*;
import Decorator.Order;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

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
    public void testStartingLoyalty(){
        Order order = new Order();
        Customer customer = new Customer(order);
        int expected = 0;
        int actual = customer.getLoyalty();
        assertEquals(expected,actual);
    }

    @Test
    public void testLoyaltyAmount(){
        Order order = new Order();
        Burger burger = new Burger();
        HotDog hotDog = new HotDog();
        order.addToOrder(hotDog);
        order.addToOrder(burger);
        Customer customer = new Customer(order);
        customer.addLoyalty();
        int expected = 1;
        int actual = customer.getLoyalty();

        assertEquals(expected,actual);
    }

    @Test
    public void testLoyaltyBonus(){
        Order order = new Order();
        Burger burger = new Burger();
        HotDog hotDog = new HotDog();
        order.addToOrder(hotDog);
        order.addToOrder(burger);
        Customer customer = new Customer(order);
        customer.addLoyalty();
        customer.addLoyalty();
        customer.addLoyalty();

        String expected = "Price After Loyalty Discount is: $0.90";;
        customer.applyLoyaltyBonus(1);
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }


}
