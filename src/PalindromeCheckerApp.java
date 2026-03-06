import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        // Normalize
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The given string is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}