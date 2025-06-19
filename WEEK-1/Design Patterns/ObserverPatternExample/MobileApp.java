public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    public void update(int price) {
        System.out.println("[" + name + " - Mobile] Stock Price Updated: " + price);
    }
}

