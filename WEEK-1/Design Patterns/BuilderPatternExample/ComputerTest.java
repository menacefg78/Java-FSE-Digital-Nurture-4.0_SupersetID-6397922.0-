public class ComputerTest {
    public static void main(String[] args) {
        // Basic build
        Computer officePC = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Office PC Configuration:");
        officePC.displayConfig();

        // Advanced build
        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();

        System.out.println("\nGaming PC Configuration:");
        gamingPC.displayConfig();
    }
}

