public class SearchDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Mouse", "Electronics"),
            new Product(102, "Keyboard", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "T-Shirt", "Fashion"),
            new Product(105, "Monitor", "Electronics")
        };

        // LINEAR SEARCH
        System.out.println("Linear Search for 'Shoes'");
        Product result1 = SearchFunctions.linearSearch(products, "Shoes");
        if (result1 != null)
            System.out.println("Found: " + result1);
        else
            System.out.println("Product not found");

        // SORT FOR BINARY SEARCH
        SearchFunctions.sortProductsByName(products);

        // BINARY SEARCH
        System.out.println("\nBinary Search for 'Keyboard'");
        Product result2 = SearchFunctions.binarySearch(products, "Keyboard");
        if (result2 != null)
            System.out.println("Found: " + result2);
        else
            System.out.println("Product not found");
    }
}

