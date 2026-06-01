
import java.util.Scanner;

// Class Movie
class movie {

    int movieId;
    String movieName;
    float rating;

    // Constructor
    movie(int movieId, String movieName, float rating) {
        
        this.movieId = movieId;
        this.movieName = movieName;
        this.rating = rating;
    }

    // Method
    void display() {
        System.out.println("Movie ID:" + movieId);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Movie Rating:" + rating);
        System.out.println();
    }
}

// Main class
public class Movieee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        movie[] movies = new movie[5];

        int count = 0;
        // Console Menu
        while (true) {
            System.out.println("===========Movie MANAGEMENT SYSTEM===============");
            System.out.println("1) Add Movie");
            System.out.println("2) Display Movies");
            System.out.println("3) Search Movie By ID");
            System.out.println("4) EXIT");

            System.out.println("ENTER CHOICE: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (count < movies.length) {
                        System.out.println("Enter Movie ID: ");
                        int movieId = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter Movie Name: ");
                        String movieName = input.nextLine();
                        input.nextLine();
                        System.out.println("Enter Rating: ");
                        float rating = input.nextFloat();

                        movies[count] = new movie(movieId, movieName, rating);
                        count++;

                        System.out.println("Movie Added SuccessFully");

                    } else {
                        System.out.println("Storage Full");
                    }
                    break;

                case 2:

                    for (int i = 0; i < count; i++) {
                        movies[i].display();
                    }
                    break;

                case 3:
                    System.out.println("Enter Movie ID to Search: ");
                    int SearchID = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (movies[i].movieId == SearchID) {
                            movies[i].display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Movie Not Found");
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
