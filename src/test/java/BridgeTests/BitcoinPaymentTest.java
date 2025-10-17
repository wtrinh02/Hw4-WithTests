package BridgeTests;

import Bridge.BitcoinPayment;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;



public class BitcoinPaymentTest {

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
    public void testPay(){
        String expected = "Bitcoin Payment Completed!";
        BitcoinPayment bitcoinPayment = new BitcoinPayment();
        bitcoinPayment.pay();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
}
