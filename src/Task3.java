import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int min;

        //Input
        year = InputHelper.getRangedInt(scan, "Birth year (1950-2010):", 1950, 2010);
        month = InputHelper.getRangedInt(scan, "Birth month (1-12):", 1, 12);

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = InputHelper.getRangedInt(scan, "Birth day (1-31):", 1, 31);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = InputHelper.getRangedInt(scan, "Birth day (1-30):", 1, 30);
        } else {
            day = InputHelper.getRangedInt(scan, "Birth day (1-29):", 1, 29);
        }

        hour = InputHelper.getRangedInt(scan, "Birth hour (1-24):", 1, 24);
        min = InputHelper.getRangedInt(scan, "Birth minute (1-59):", 1, 59);

        //Output
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + min);
    }
}
