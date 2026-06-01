public class Task05 {

    public static void main(String[] args) {

        // 1. Variable Declarations
        int number = 100;
        float floatValue = 12.56f;
        double doubleValue = 99.98765;
        char letter = 'A';
        boolean isJavaFun = true;

        // 2. Output Formatting using printf
        System.out.println("===== OUTPUT FORMATTING =====");

        System.out.printf("Integer Value: %d\n", number);

        // 2 decimal places
        System.out.printf("Float Value: %.2f\n", floatValue);

        // 3 decimal places
        System.out.printf("Double Value: %.3f\n", doubleValue);

        // Character
        System.out.printf("Character Value: %c\n", letter);

        // Boolean
        System.out.printf("Boolean Value: %b\n", isJavaFun);

        // Padding example
        System.out.printf("Padded Integer: %10d\n", number);

        // Left alignment
        System.out.printf("Left Aligned Float: %-10.2f\n", floatValue);

        System.out.println("\n===== TYPE CONVERSION (CASTING) =====");

        // 3. Type Conversion

        // double to int
        int convertedInt = (int) doubleValue;
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting double to int: " + convertedInt);
        System.out.println("Explanation: Decimal part is removed (truncation occurs).");

        System.out.println();

        // int to char
        int asciiValue = 66;
        char convertedChar = (char) asciiValue;

        System.out.println("Original int value: " + asciiValue);
        System.out.println("After casting int to char: " + convertedChar);
        System.out.println("Explanation: ASCII value 66 represents character 'B'.");

        System.out.println();

        // char to int
        char myChar = 'Z';
        int charToInt = (int) myChar;

        System.out.println("Original char value: " + myChar);
        System.out.println("After casting char to int: " + charToInt);
        System.out.println("Explanation: ASCII value of 'Z' is 90.");

        System.out.println();

        // float to int
        float decimalNumber = 45.89f;
        int floatToInt = (int) decimalNumber;

        System.out.println("Original float value: " + decimalNumber);
        System.out.println("After casting float to int: " + floatToInt);
        System.out.println("Explanation: Decimal part is lost.");

        System.out.println("\n===== STRING CONVERSION =====");

        // 4. Numeric to String
        String intString = String.valueOf(number);
        String doubleString = String.valueOf(doubleValue);

        System.out.println("Integer converted to String: " + intString);
        System.out.println("Double converted to String: " + doubleString);

        System.out.println();

        // String to Numeric
        String ageText = "25";
        String priceText = "199.99";

        int age = Integer.parseInt(ageText);
        double price = Double.parseDouble(priceText);

        System.out.println("String \"" + ageText + "\" converted to int: " + age);
        System.out.println("String \"" + priceText + "\" converted to double: " + price);

        System.out.println("\n===== PROGRAM COMPLETED =====");
    }
}