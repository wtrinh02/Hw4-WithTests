package Bridge;
public abstract class Channel {

    protected Payment paymentType;

    abstract public void notifyPayment();
    
}
