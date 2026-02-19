import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP         ");
        System.out.println("               Version 1.0             ");
        System.out.println("=======================================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
