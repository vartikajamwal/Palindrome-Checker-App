import java.util.*;

public class PalindromeCheckerApp {

    public static boolean twoPointerPalindrome(String str) {

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

    public static boolean stackPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static boolean reversePalindrome(String str) {

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = twoPointerPalindrome(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = reversePalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("\nPalindrome Results:");
        System.out.println("Two Pointer Method: " + result1);
        System.out.println("Stack Method: " + result2);
        System.out.println("Reverse Method: " + result3);

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Two Pointer Method: " + (end1 - start1));
        System.out.println("Stack Method: " + (end2 - start2));
        System.out.println("Reverse Method: " + (end3 - start3));

        sc.close();
    }
}