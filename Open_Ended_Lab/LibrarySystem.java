import java.util.Scanner;

// Book Class implementing Part A, B, C, and D [cite: 40, 54, 66, 94]
class Book {
    // Part D: Private data members (Access Control) [cite: 97]
    private int bookId;
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Part C: Default Constructor [cite: 87]
    public Book() {
        this.bookId = 0;
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Part C: Parameterized Constructor [cite: 88]
    public Book(int bookId, String title, String author, double price, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Part D: Getters and Setters [cite: 98]
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    // Part C: inputBook() Method using Scanner (Part A & B) [cite: 53, 80]
    public void inputBook(Scanner sc) {
        System.out.print("Enter Book ID: ");
        this.bookId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Book Title: ");
        this.title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        this.author = sc.nextLine();
        System.out.print("Enter Book Price: ");
        this.price = sc.nextDouble();
        System.out.print("Is Book Available? (true/false): ");
        this.isAvailable = sc.nextBoolean();
    }

    // Part B: calculateFine() Method [cite: 56, 83]
    public int calculateFine(int daysIssued) {
        int fine = 0;
        if (daysIssued <= 7) {
            fine = 0; // 0-7 days -> No Fine [cite: 57]
        } else if (daysIssued <= 14) {
            fine = (daysIssued - 7) * 10; // 8-14 days -> Rs. 10/day [cite: 59]
        } else {
            fine = (7 * 10) + ((daysIssued - 14) * 20); // Above 14 days -> Rs. 20/day [cite: 61]
        }
        return fine;
    }

    // Part C: displayBook() Method with Formatted Output [cite: 52, 82]
    public void displayBook() {
        System.out.println("----------------------------------------");
        System.out.printf("Book ID: %d\n", bookId);
        // Part E: String functions toUpperCase() aur length() applied here [cite: 107, 108]
        System.out.printf("Title: %s (Length: %d)\n", title.toUpperCase(), title.length());
        System.out.printf("Author: %s\n", author);
        System.out.printf("Price: Rs. %.2f\n", price);
        System.out.printf("Status: %s\n", isAvailable ? "Available" : "Issued");
        System.out.println("----------------------------------------");
    }
}

// Main Class for Task 01
public class LibrarySystem {
    
    // Part D: Overloaded searchBook by ID [cite: 99, 100]
    public static void searchBook(Book[] books, int id) {
        boolean found = false;
        for (Book b : books) {
            if (b.getBookId() == id) {
                System.out.println("\n[Book Found by ID!]");
                b.displayBook();
                found = true;
                break;
            }
        }
        if (!found) System.out.println("\nBook with ID " + id + " not found.");
    }

    // Part D: Overloaded searchBook by Title [cite: 99, 101]
    public static void searchBook(Book[] books, String titleKeyword) {
        boolean found = false;
        for (Book b : books) {
            // Part E: String function contains() used here [cite: 109]
            if (b.getTitle().toLowerCase().contains(titleKeyword.toLowerCase())) {
                System.out.println("\n[Book Found by Title Keyword!]");
                b.displayBook();
                found = true;
            }
        }
        if (!found) System.out.println("\nNo book found containing: " + titleKeyword);
    }

    public static void main(String[] args) {
        // FIXED LINE HERE
        Scanner sc = new Scanner(System.in);

        // Part E: Store records of 5 books using Array of Objects [cite: 104]
        Book[] libraryBooks = new Book[5];

        System.out.println("=== Enter 5 Books Details ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nRecording Book " + (i + 1) + ":");
            libraryBooks[i] = new Book(); // Default constructor call [cite: 89]
            libraryBooks[i].inputBook(sc);
        }

        // Part E: Traverse records using loops [cite: 105]
        System.out.println("\n=== Displaying All Registered Books ===");
        for (Book b : libraryBooks) {
            b.displayBook();
        }

        // Part B: Fine Calculation Demo [cite: 56]
        System.out.println("\n=== Testing Fine Calculation (Part B) ===");
        System.out.print("Enter number of days a book has been issued: ");
        int days = sc.nextInt();
        
        // Testing fine calculation [cite: 64]
        int totalFine = libraryBooks[0].calculateFine(days);
        System.out.println("Total Overdue Fine: Rs. " + totalFine);

        // Part D: Overloaded Search Method Testing [cite: 99]
        System.out.println("\n=== Testing Search Functionality ===");
        System.out.print("Enter Book ID to search: ");
        int searchId = sc.nextInt();
        searchBook(libraryBooks, searchId);

        sc.nextLine(); // Clear buffer
        System.out.print("Enter Title Keyword to search: ");
        String keyword = sc.nextLine();
        searchBook(libraryBooks, keyword);

        sc.close();
    }
}