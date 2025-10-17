package BridgeTests;

import Bridge.BitcoinPayment;
import Bridge.CashOnDeliveryPayment;
import Bridge.EmailChannel;
import Bridge.OnlinePaymentNotification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailChannelTest {
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
        String expected = "From Email Channel: Bitcoin Payment Completed!";
        BitcoinPayment bitcoinPayment = new BitcoinPayment();
        EmailChannel emailChannel = new EmailChannel(bitcoinPayment);
        emailChannel.notifyPayment();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
    @Test
    public void testNotifyPaymentCash(){
        String expected = "From Email Channel: Cash on Delivery Completed!";
        CashOnDeliveryPayment cashOnDeliveryPayment = new CashOnDeliveryPayment();
        EmailChannel emailChannel = new EmailChannel(cashOnDeliveryPayment);
        emailChannel.notifyPayment();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
    @Test
    public void testNotifyPaymentOnline(){
        String expected = "From Email Channel: Online Payment Completed!";
        OnlinePaymentNotification onlinePaymentNotification = new OnlinePaymentNotification();
        EmailChannel emailChannel = new EmailChannel(onlinePaymentNotification);
        emailChannel.notifyPayment();
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
}
