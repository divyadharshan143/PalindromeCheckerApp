import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP         ");
        System.out.println("               Version 1.0             ");
        System.out.println("=======================================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String original = scanner.nextLine();

        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
