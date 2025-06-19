import java.util.HashMap;
import java.util.Scanner;

public class InventorySystem {
    HashMap<Integer, Product> inventory = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    // Add product
    public void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Product p = new Product(id, name, qty, price);
        inventory.put(id, p);
        System.out.println("Product added.\n");
    }

    // Update product
    public void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        int id = sc.nextInt();
        if (inventory.containsKey(id)) {
            sc.nextLine();
            System.out.print("Enter New Name: ");
            String name = sc.nextLine();
            System.out.print("Enter New Quantity: ");
            int qty = sc.nextInt();
            System.out.print("Enter New Price: ");
            double price = sc.nextDouble();
            Product p = new Product(id, name, qty, price);
            inventory.put(id, p);
            System.out.println("Product updated.\n");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete product
    public void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = sc.nextInt();
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("Product deleted.\n");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display inventory
    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InventorySystem system = new InventorySystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Product\n2. Update Product\n3. Delete Product\n4. Show Inventory\n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: system.addProduct(); break;
                case 2: system.updateProduct(); break;
                case 3: system.deleteProduct(); break;
                case 4: system.showInventory(); break;
                case 5: return;
                default: System.out.println("Invalid choice");
            }
        }
    }
}

