public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor processor1 = new PhonePeAdapter();
        processor1.processPayment(500);

        PaymentProcessor processor2 = new PaytmAdapter();
        processor2.processPayment(1000);
    }
}
