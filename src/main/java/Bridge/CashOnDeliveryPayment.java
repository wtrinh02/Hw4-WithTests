package Bridge;
public class CashOnDeliveryPayment implements Payment {

    @Override
    public void pay() {
        
        System.out.println("Cash on Delivery Completed!");
    }
    
}
