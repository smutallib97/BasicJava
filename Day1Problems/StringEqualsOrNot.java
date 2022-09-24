package Day1Problems;

import java.util.Scanner;

public class StringEqualsOrNot {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String:" );
        s1 = sc.next();
        System.out.println("Enter Second String:");
        s2 = sc.next();

        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equals");
        }
    }
}
