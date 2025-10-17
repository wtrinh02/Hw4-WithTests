package Bridge;

public class DriverOne {
 
    public static void main (String args[]){

        //Part 1

        EmailChannel emailOnline = new EmailChannel(new OnlinePaymentNotification());
        EmailChannel emailCash = new EmailChannel(new CashOnDelivaryPayment());
        SmsChannel smsOnline = new SmsChannel(new OnlinePaymentNotification());
        SmsChannel smsCash = new SmsChannel(new CashOnDelivaryPayment());

        emailOnline.notifyPayment();
        emailCash.notifyPayment();
        smsOnline.notifyPayment();
        smsCash.notifyPayment();

        System.out.println("--------------------------------------------------------");

        //Part 2
        EmailChannel emailBitcoin = new EmailChannel(new BitcoinPayment());
        SmsChannel smsBitcoin = new SmsChannel(new BitcoinPayment());

        emailBitcoin.notifyPayment();
        smsBitcoin.notifyPayment();

        System.out.println("--------------------------------------------------------");
        //Part 3
        PushChannel pushBitcoin = new PushChannel(new BitcoinPayment());
        PushChannel pushOnline = new PushChannel(new OnlinePaymentNotification());
        PushChannel pushCash = new PushChannel(new CashOnDelivaryPayment());

        pushBitcoin.notifyPayment();
        pushOnline.notifyPayment();
        pushCash.notifyPayment();


    }
}
