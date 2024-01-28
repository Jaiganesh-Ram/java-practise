public class Find {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers as command line arguments.");
            System.exit(1);
        }

        double[] numbers = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            if (isNumeric(args[i])) {
                numbers[i] = Double.parseDouble(args[i]);
            } else {
                System.out.println("Invalid input. Please provide valid numbers.");
                System.exit(1);
            }
        }

        double average = calculateAverage(numbers);
        System.out.println("Average of the provided numbers: " + average);
    }

    
    private static double calculateAverage(double[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }

    
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
