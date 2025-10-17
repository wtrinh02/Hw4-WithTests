package Bridge;
public class EmailChannel extends Channel{
    

    public EmailChannel(Payment payment){
        this.paymentType = payment;
    }

    @Override
    public void notifyPayment() {
        System.out.print("From Email Channel: ");
        paymentType.pay();
    }
    
}
