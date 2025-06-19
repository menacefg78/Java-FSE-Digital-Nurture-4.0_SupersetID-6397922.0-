public class SortDemo {
    public static void printOrders(Order[] orders, String label) {
        System.out.println("\n" + label);
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Order[] orders1 = {
            new Order(1, "Alice", 2500.00),
            new Order(2, "Bob", 499.99),
            new Order(3, "Charlie", 1750.50),
            new Order(4, "David", 3200.00)
        };

        // Clone for quick sort to avoid modifying original
        Order[] orders2 = orders1.clone();

        // Bubble Sort
        BubbleSort.sort(orders1);
        printOrders(orders1, "Sorted by Bubble Sort:");

        // Quick Sort
        QuickSort.sort(orders2, 0, orders2.length - 1);
        printOrders(orders2, "Sorted by Quick Sort:");
    }
}
