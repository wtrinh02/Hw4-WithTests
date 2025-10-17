package Bridge;
public class CashOnDelivaryPayment implements Payment {

    @Override
    public void pay() {
        
        System.out.println("Cash on Delivery Completed!");
    }
    
}
