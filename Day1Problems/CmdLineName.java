package Day1Problems;

import java.util.Scanner;

public class CmdLineName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String First = sc.next();
        System.out.println("Enter Your Last Name: ");
        String Second = sc.next();
        System.out.println(First + Second);
    }
}
