package M3;

/*
Challenge 1: Command-Line Calculator
------------------------------------
- Accept two numbers and an operator as command-line arguments
- Supports addition (+) and subtraction (-)
- Allow integer and floating-point numbers
- Ensures correct decimal places in output based on input (e.g., 0.1 + 0.2 → 1 decimal place)
- Display an error for invalid inputs or unsupported operators
- Capture 5 variations of tests
*/

public class CommandLineCalculator extends BaseClass {
    private static String ucid = "kk753"; // <-- change to your ucid

    public static void main(String[] args) {
        printHeader(ucid, 1, "Objective: Implement a calculator using command-line arguments.");

        if (args.length != 3) {
            System.out.println("Usage: java M3.CommandLineCalculator <num1> <operator> <num2>");
            printFooter(ucid, 1);
            return;
        }

        try {
            System.out.println("Calculating result...");
            // extract the equation (format is <num1> <operator> <num2>)
            String num1 = args[0];
            String operator = args[1];
            String num2 = args[2];

            // check if operator is addition or subtraction
            if(operator.equals("+")){
                System.out.println("addition");
            } else if(operator.equals("-")){
                System.out.println("subtraction");
            } else {
                System.out.println("Invalid input");
            }
            // check the type of each number and choose appropriate parsing
            double number1;
            double number2;

            if (num1.contains(".") || num2.contains(".")) {
                number1 = Double.parseDouble(num1);
                number2 = Double.parseDouble(num2);
            } else {
                number1 = Integer.parseInt(num1);
                number2 = Integer.parseInt(num2);
            }

            // generate the equation result (Important: ensure decimals display as the
            // longest decimal passed)
            // i.e., 0.1 + 0.2 would show as one decimal place (0.3), 0.11 + 0.2 would shows
            // as two (0.31), etc
            double result;

            if (operator.equals("+")) {
                result = number1 + number2;
            } else {
                result = number1 - number2;
            }

            int decimalPlaces1 = 0;
            int decimalPlaces2 = 0;

            if (num1.contains(".")) {
                decimalPlaces1 = num1.length() - num1.indexOf(".") - 1;
            }

            if (num2.contains(".")) {
                decimalPlaces2 = num2.length() - num2.indexOf(".") - 1;
            }

            int decimalPlaces = Math.max(decimalPlaces1, decimalPlaces2);
            System.out.printf("%." + decimalPlaces + "f%n", result);
            
        } catch (Exception e) {
            System.out.println("Invalid input. Please ensure correct format and valid numbers.");
        }

        printFooter(ucid, 1);
    }
}