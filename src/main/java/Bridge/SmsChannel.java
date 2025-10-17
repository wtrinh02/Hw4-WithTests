package Bridge;
public class SmsChannel extends Channel{

    public SmsChannel(Payment payment){
        this.paymentType = payment;
    }

    @Override
    public void notifyPayment() {
        System.out.print("From SMS Channel: ");
        paymentType.pay();
    }
    
}
