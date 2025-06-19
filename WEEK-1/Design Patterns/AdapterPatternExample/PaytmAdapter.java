public class PaytmAdapter implements PaymentProcessor{
    private Paytm paytm=new Paytm();
    public void processPayment(int amount){
        paytm.sendmoney(amount);
    }

}
