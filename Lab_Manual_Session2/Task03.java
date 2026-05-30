import java.util.Scanner;

public class Task003 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter current temperature (°C): ");
        int temperature = input.nextInt();

        System.out.print("Enter weather condition (rainy/sunny): ");
        String weather = input.next();

        // Weather advice logic
        if (temperature < 0) {

            if (weather.equalsIgnoreCase("rainy")) {
                System.out.println("Wear a heavy coat and take an umbrella.");
            } else if (weather.equalsIgnoreCase("sunny")) {
                System.out.println("Wear a heavy coat and sunglasses.");
            }

        } else if (temperature >= 0 && temperature <= 10) {

            if (weather.equalsIgnoreCase("rainy")) {
                System.out.println("Wear a warm jacket and take an umbrella.");
            } else if (weather.equalsIgnoreCase("sunny")) {
                System.out.println("Wear a warm jacket and sunglasses.");
            }

        } else if (temperature >= 11 && temperature <= 20) {

            if (weather.equalsIgnoreCase("rainy")) {
                System.out.println("Wear a light jacket and take an umbrella.");
            } else if (weather.equalsIgnoreCase("sunny")) {
                System.out.println("Wear a light jacket and sunglasses.");
            }

        } else if (temperature > 20) {

            if (weather.equalsIgnoreCase("rainy")) {
                System.out.println("Wear light clothing and take an umbrella.");
            } else if (weather.equalsIgnoreCase("sunny")) {
                System.out.println("Wear light clothing and sunglasses.");
            }
        }

        input.close();
    }
}