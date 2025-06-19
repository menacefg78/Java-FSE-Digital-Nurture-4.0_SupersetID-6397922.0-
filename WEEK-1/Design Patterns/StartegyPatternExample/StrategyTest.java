public class StrategyTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(250);  // Paid 250 using Credit Card.

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(400);  // Paid 400 using PayPal.

        cart.setPaymentStrategy(new BankTransferPayment());
        cart.checkout(1000); // Paid 1000 using Bank Transfer.
    }
}
