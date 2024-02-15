import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[0];
        int[] ages = new int[0];
        boolean[] isMarriedArray = new boolean[0];

        while (true) {
            System.out.print("Enter name (type 'exit' to terminate): ");
            String name = scanner.nextLine();

            if ("exit".equalsIgnoreCase(name)) {
                break;
            }

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Are you married? (true/false): ");
            boolean isMarried = Boolean.parseBoolean(scanner.nextLine());

            // Expand arrays
            //names = expandArray(names, name);
            //ages = expandArray(ages, age);
            //isMarriedArray = expandArray(isMarriedArray, isMarried);
        }

        // Display all entered details
        System.out.println("\nEntered Details:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i] + ", Marital Status: " + isMarriedArray[i]);
        }

        scanner.close();
    }

   
    }

