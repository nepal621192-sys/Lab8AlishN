import java.util.Scanner;

public class InputHelper {
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String s;
        boolean valid = false;

        System.out.println(prompt);

        do {
            s = scan.nextLine();

            if (s.length() > 0) {
                valid = true;
            } else {
                System.out.println("Error: Try again. You entered a String of length 0.");
            }
        } while (!valid);

        return s;
    }

    public static int getInt(Scanner scan, String prompt) {
        int n = 0;
        boolean valid = false;

        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error: Try again. You must enter an integer value.");
            }

            scan.nextLine();
        } while (!valid);

        return n;
    }

    public static double getDouble(Scanner scan, String prompt) {
        double d = 0;
        boolean valid = false;

        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                d = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Error: Try again. You must enter a double value.");
            }

            scan.nextLine();
        } while (!valid);

        return d;
    }

    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        int n = 0;
        boolean valid = false;

        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                n = scan.nextInt();

                if (n <= max && n >= min) {
                    valid = true;
                } else {
                    System.out.println("Error: Try again. You must enter an integer within the range.");
                }
            } else {
                System.out.println("Error: Try again. You must enter an integer value.");
            }

            scan.nextLine();
        } while (!valid);

        return n;
    }

    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        double d = 0;
        boolean valid = false;

        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                d = scan.nextDouble();

                if (d <= max && d >= min) {
                    valid = true;
                } else {
                    System.out.println("Error: Try again. You must enter a double within the range.");
                }
            } else {
                System.out.println("Error: Try again. You must enter a double value.");
            }

            scan.nextLine();
        } while (!valid);

        return d;
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        int n = 0;
        boolean valid = false;

        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                n = scan.nextInt();

                if (n > 0) {
                    valid = true;
                } else {
                    System.out.println("Error: Try again. You must enter a positive non-zero integer.");
                }
            } else {
                System.out.println("Error: Try again. You must enter an integer value.");
            }

            scan.nextLine();
        } while (!valid);

        return n;
    }

    public static boolean getYNConfirm(Scanner scan, String prompt) {
        String input;
        boolean valid = false;

        System.out.println(prompt);

        do {
            input = scan.nextLine();

            if (input.equalsIgnoreCase("Y")) {
                valid = true;
                return true;
            } else if (input.equalsIgnoreCase("N")) {
                valid = true;
                return false;
            } else {
                System.out.println("Error: Try again. ");
            }
        } while (!valid);

        return false;
    }

    public static String getRegExString(Scanner scan, String prompt, String regexPattern) {
        String s;
        boolean valid = false;

        System.out.println(prompt);

        do {
            s = scan.nextLine();

            if (s.matches(regexPattern)) {
                valid = true;
            } else {
                System.out.println("Error: Input must match the specified pattern.");
            }
        } while (!valid);

        return s;
    }
}