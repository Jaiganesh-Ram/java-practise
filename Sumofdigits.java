public class Sumofdigits{

    public static void main(String[] args) {
        // Example: Find the sum of digits for the number 123456789
        int number = 123456789;

        int sum = findSumOfDigits(number);

        System.out.println("The sum of digits for the number " + number + " is: " + sum);
    }

    // Function to find the sum of digits of a given number
    public static int findSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}