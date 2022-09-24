package Day2Assignment.WhileLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int num = sc.nextInt();

        while(num != 0)
        {
            int reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num/10;
        }
        System.out.println("The reverse number is : " +reverse);
    }
}
