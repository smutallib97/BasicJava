package Day2Assignment.WhileLoop;

import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        int n, i=1, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural Number: ");
        n = sc.nextInt();

        while(i <= n)
        {
            sum += i;
            ++i;
        }
        System.out.println("Sum of Natural Number is : " +sum);
    }
}
