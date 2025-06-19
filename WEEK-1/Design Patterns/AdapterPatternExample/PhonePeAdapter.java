public class PhonePeAdapter implements PaymentProcessor {
    private PhonePe phonepe=new PhonePe();
    public void processPayment(int amount){
        phonepe.transfermoney(amount);
    }
    
}
