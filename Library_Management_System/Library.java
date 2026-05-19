
import java.util.Scanner;

// Class Books
class book{

    private int bookid;
    private String bookname;
    private String authorname;

    // Constructor
    book (int bookid, String bookname, String authorname) {
        
        this.bookid = bookid;
        this.bookname = bookname;
        this.authorname = authorname;
    }

    // getters setters 


        public int getBookId(){
        return bookid;
    }
        public String getBookName(){
        return bookname;
    }
        public String getAuthorName(){
        return authorname;
    }        

    public void setBookId(int bookid){
        this.bookid = bookid;
    }
    public void setBookName(String bookname){
        this.bookname = bookname;
    }
    public void setAuthorName(String authorname){
        this.authorname = authorname;
    }

    // display

        // Method
    
        void display(){
        System.out.print("=======================================");
        System.out.println();
        System.out.println("ID:" + bookid);
        System.out.println("BookName: " + bookname);
        System.out.println("AuthorName:" + authorname);
        System.out.print("=======================================");
        System.out.println();
    }



}

// Main class
public class Library {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        book[] books = new book[5];

        int count = 0;
        // Console Menu
        while (true) {
            System.out.println("===========LIBRARY MANAGEMENT SYSTEM===============");
            System.out.println("1) Add Book");
            System.out.println("2) Display Books");
            System.out.println("3) Search Book By ID");
            System.out.println("4) EXIT");

            System.out.println("ENTER CHOICE: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (count < books.length) {
                        System.out.println("Book ID: ");
                        int bookid = input.nextInt();
                        input.nextLine();

                        System.out.println("Book Name: ");
                        String bookname = input.nextLine();

                        System.out.println("Author: ");
                        String authorname = input.nextLine();
                        

                        books[count] = new book(bookid, bookname, authorname);
                        count++;

                        System.out.println("Book Added SuccessFully");

                    } else {
                        System.out.println("Storage Full");
                    }
                    break;

                case 2:

                    for (int i = 0; i < count; i++) {
                        books[i].display();
                    }
                    break;

                case 3:
                    System.out.println("Enter Book ID to Search: ");
                    int SearchID = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].getBookId()== SearchID) {
                            books[i].display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book Not Found");
                    }
                    break;

                case 4:

                    System.out.println("Exiting...");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }
        }

    }
}
