package Bridge;
public class OnlinePaymentNotification implements Payment{

    @Override
    public void pay() {
        System.out.println("Online Payment Completed!");
    }
    
}
