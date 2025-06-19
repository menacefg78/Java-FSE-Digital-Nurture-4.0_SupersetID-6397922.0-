public class LibraryDemo {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Basics", "John Smith"),
            new Book(2, "C Programming", "Brian Kernighan"),
            new Book(3, "Python Essentials", "Guido van Rossum"),
            new Book(4, "Data Structures", "Narasimha Karumanchi"),
            new Book(5, "Operating Systems", "Abraham Silberschatz")
        };

        // Linear Search
        String target1 = "Python Essentials";
        Book result1 = LibrarySearch.linearSearch(books, target1);
        if (result1 != null) {
            System.out.println("Linear Search Result: " + result1);
        } else {
            System.out.println("Book not found (linear search).");
        }

        // Sort books before binary search
        LibrarySearch.sortBooksByTitle(books);

        // Binary Search
        String target2 = "Data Structures";
        Book result2 = LibrarySearch.binarySearch(books, target2);
        if (result2 != null) {
            System.out.println("Binary Search Result: " + result2);
        } else {
            System.out.println("Book not found (binary search).");
        }
    }
}
