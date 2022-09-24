package Day2Assignment.ifelse;

import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int n1=n, n2=n;
        int a=n1 % 10, b=n2 % 10;

        String[] single_digits = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        String[] two_digits = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens_multiples = new String[]{"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if(a==1){
            System.out.println(two_digits[a+1]);
        } else if (b==0)
            System.out.println(tens_multiples[b]);
            else
                System.out.println(tens_multiples[a] + " " + single_digits[b]);
    }
}
