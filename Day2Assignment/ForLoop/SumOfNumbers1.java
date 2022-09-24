package Day2Assignment.ForLoop;

import java.util.Scanner;

public class SumOfNumbers1 {
    public static void main(String[] args) {
        int n, i, sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        n = sc.nextInt();

        for(i=1; i<=n; i++)
        {
            sum = sum + i;
        }
        System.out.println(" The  Sum of Natural Numbers from 1 to " +n+ "=" +sum);
    }
}
