package BridgeTests;

import Bridge.OnlinePaymentNotification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlinePaymentNotificationTest {
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
        String expected = "Online Payment Completed!";
        OnlinePaymentNotification onlinePaymentNotification = new OnlinePaymentNotification();
        onlinePaymentNotification.pay();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
}
