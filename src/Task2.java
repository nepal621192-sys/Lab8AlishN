import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        int favInt;
        double favDouble;

        //Input
        favInt = InputHelper.getInt(scan, "Enter your favorite int:");
        favDouble = InputHelper.getDouble(scan, "Enter your favorite double:");

        //Output
        System.out.println("\nYour favorite int is " +  favInt + " and your favorite double is " + favDouble);
    }
}
