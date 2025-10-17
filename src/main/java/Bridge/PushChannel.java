package Bridge;
public class PushChannel extends Channel{

public PushChannel(Payment payment){
    this.paymentType = payment;
}

    @Override
    public void notifyPayment() {
        System.out.print("From Push Channel: ");
        paymentType.pay();
    }
    
}
