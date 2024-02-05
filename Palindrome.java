public class Palindrome{

    public static void main(String[] args) {
        // Example: Check if 120 is a palindrome
        int numberToCheck = 120;

        if (isPalindrome(numberToCheck)) {
            System.out.println(numberToCheck + " is a palindrome.");
        } else {
            System.out.println(numberToCheck + " is not a palindrome.");
        }
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}