import java.util.Scanner;

public class Task5 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        String ssn;
        String mNum;
        String menuChoice;

        //Input/Output
        ssn = InputHelper.getRegExString(scan, "Enter SSN [xxx-xx-xxxx]:", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + ssn);
        mNum = InputHelper.getRegExString(scan, "\nEnter student M number [Mxxxxx]:", "(M|m)\\d{5}");
        System.out.println("Your M number is: " + mNum);
        menuChoice = InputHelper.getRegExString(scan, "\nMenu: O-Open S-Save V-View Q-Quit", "[OoSsVvQq]");
        System.out.println("You choose: " + menuChoice);
    }
}
