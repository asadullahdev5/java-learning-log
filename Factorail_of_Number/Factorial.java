public class Factorial {
    public static void main(String[] args) {
        int num = 15; 
        long fact = 1; // Use long because 15! exceeds the limit of an int
        
        for (int i = 1; i <= num; i++) {
           fact *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
