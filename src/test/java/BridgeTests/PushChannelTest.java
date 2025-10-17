package BridgeTests;

import Bridge.BitcoinPayment;
import Bridge.CashOnDeliveryPayment;
import Bridge.PushChannel;
import Bridge.OnlinePaymentNotification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PushChannelTest {
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
    public void testNotifyPaymentBitcoin(){
        String expected = "From Push Channel: Bitcoin Payment Completed!";
        BitcoinPayment bitcoinPayment = new BitcoinPayment();
        PushChannel pushChannel = new PushChannel(bitcoinPayment);
        pushChannel.notifyPayment();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
    @Test
    public void testNotifyPaymentCash(){
        String expected = "From Push Channel: Cash on Delivery Completed!";
        CashOnDeliveryPayment cashOnDeliveryPayment = new CashOnDeliveryPayment();
        PushChannel pushChannel = new PushChannel(cashOnDeliveryPayment);
        pushChannel.notifyPayment();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
    @Test
    public void testNotifyPaymentOnline(){
        String expected = "From Push Channel: Online Payment Completed!";
        OnlinePaymentNotification onlinePaymentNotification = new OnlinePaymentNotification();
        PushChannel pushChannel = new PushChannel(onlinePaymentNotification);
        pushChannel.notifyPayment();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
}
