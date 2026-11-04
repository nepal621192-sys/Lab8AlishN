import java.util.Scanner;

public class Task6 {
    static void main(String[] args) {
        //Vars
        double temp;
        Scanner scan = new Scanner(System.in);

        //Input
        temp = InputHelper.getDouble(scan, "Enter temperature in Celsius:");

        //Output
        System.out.println("The temperature in Fahrenheit is: " + celsiusToFahrenheit(temp));
    }

    public static double celsiusToFahrenheit(double celsius) {
        double f;

        f = ((double) 9 / 5) * celsius + 32;

        return f;
    }
}
