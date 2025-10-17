package BridgeTests;

import Bridge.BitcoinPayment;
import Bridge.CashOnDeliveryPayment;
import Bridge.OnlinePaymentNotification;
import Bridge.SmsChannel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmsChannelTest {
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
        String expected = "From SMS Channel: Bitcoin Payment Completed!";
        BitcoinPayment bitcoinPayment = new BitcoinPayment();
        SmsChannel smsChannel = new SmsChannel(bitcoinPayment);
        smsChannel.notifyPayment();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
    @Test
    public void testNotifyPaymentCash(){
        String expected = "From SMS Channel: Cash on Delivery Completed!";
        CashOnDeliveryPayment cashOnDeliveryPayment = new CashOnDeliveryPayment();
        SmsChannel smsChannel = new SmsChannel(cashOnDeliveryPayment);
        smsChannel.notifyPayment();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
    @Test
    public void testNotifyPaymentOnline(){
        String expected = "From SMS Channel: Online Payment Completed!";
        OnlinePaymentNotification onlinePaymentNotification = new OnlinePaymentNotification();
        SmsChannel smsChannel = new SmsChannel(onlinePaymentNotification);
        smsChannel.notifyPayment();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
}
