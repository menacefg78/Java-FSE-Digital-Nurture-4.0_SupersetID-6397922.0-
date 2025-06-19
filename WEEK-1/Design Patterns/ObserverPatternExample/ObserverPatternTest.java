public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileClient = new MobileApp("Client A");
        Observer webClient = new WebApp("Client B");

        stockMarket.registerObserver(mobileClient);
        stockMarket.registerObserver(webClient);

        System.out.println("Setting stock price to 120...");
        stockMarket.setStockPrice(120);

        System.out.println("\nSetting stock price to 150...");
        stockMarket.setStockPrice(150);

        // Remove one observer
        stockMarket.removeObserver(webClient);

        System.out.println("\nSetting stock price to 200...");
        stockMarket.setStockPrice(200);
    }
}

