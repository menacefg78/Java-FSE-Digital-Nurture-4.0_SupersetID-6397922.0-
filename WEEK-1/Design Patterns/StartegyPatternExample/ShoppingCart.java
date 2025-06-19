public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}

