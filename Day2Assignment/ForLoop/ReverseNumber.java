package Day2Assignment.ForLoop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        num = sc.nextInt();

        for(;num != 0; num = num / 10)
        {
            int reminder = num % 10;
            rev = rev * 10 + reminder;
        }
        System.out.println("The Reverse of the given number is : " +rev);
    }
}
