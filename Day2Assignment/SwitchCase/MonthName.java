package Day2Assignment.SwitchCase;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        String month;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month a Name: ");
        month = sc.next();

        switch (month)
        {
            case "January":
            System.out.println("Entered Month is: " +month);
            break;
            case "February":
                System.out.println("Entered Month is: " +month);
                break;
            case "March":
                System.out.println("Entered Month is: " +month);
                break;
            case "April":
                System.out.println("Entered Month is: " +month);
                break;
            case "May":
                System.out.println("Entered Month is: " +month);
                break;
            case "June":
                System.out.println("Entered Month is: " +month);
                break;
            case "July":
                System.out.println("Entered Month is: " +month);
                break;
            case "August":
                System.out.println("Entered Month is: " +month);
                break;
            case "September":
                System.out.println("Entered Month is: " +month);
                break;
            case "October":
                System.out.println("Entered Month is: " +month);
                break;
            case "November":
                System.out.println("Entered Month is: " +month);
                break;
            case "December":
                System.out.println("Entered Month is: " +month);
                break;
            default:
                System.out.println("Entered month name is wrong");

        }
    }
}
