package Bridge;
public class BitcoinPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Bitcoin Payment Completed!");
    }
    
}