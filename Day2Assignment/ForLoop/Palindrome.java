package Day2Assignment.ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int last_digit, a, sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check :");
        int n = sc.nextInt();
        a=n;

        for(sum = 0; n != 0; n /= 10)
        {
            last_digit = n % 10;
            sum = (sum * 10) + last_digit;
        }
        if(sum == a)

            System.out.println("Number is Palindrome");
            else
            System.out.println("Number is not Palindrome");


    }
}
