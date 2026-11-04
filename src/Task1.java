import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        String userName;

        //Input
        userName = InputHelper.getNonZeroLenString(scan, "Enter username:");

        //Output
        System.out.println("You entered: " + userName);
    }
}
