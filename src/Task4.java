import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        double price;
        double total = 0;
        boolean cont = false;

        //Input
        do {
            price = InputHelper.getRangedDouble(scan, "Enter price:", 0.5, 9.99);
            total += price;
            cont = InputHelper.getYNConfirm(scan, "Do you want to enter another item? [Y/N]");
        } while (cont);

        //Output
        System.out.printf("Total cost in $:%8.2f", total);
    }
}
