import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {

    // Linear Search by Title
    public static Book linearSearch(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    // Sort books by title
    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
    }

    // Binary Search by Title (after sorting)
    public static Book binarySearch(Book[] books, String title) {
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = title.compareToIgnoreCase(books[mid].title);
            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null;
    }
}

