import java.util.Scanner;

public class Main {

    // Recursive method to calculate the power of a number
    static int power(int base, int exponent) {
        // Base case: when the exponent is 0, return 1
        if (exponent == 0) {
            return 1;
        } else {
            // Recursive step: multiply the base with the power of base^(exponent-1)
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent value: ");
        int exponent = input.nextInt();

        // Calculate the result using the power method
        int result = power(base, exponent);
        System.out.println("Result: " + result);
    }
}
