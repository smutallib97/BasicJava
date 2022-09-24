package Day2Assignment.Operators;

import java.util.Scanner;

public class MinMax {
     static float min(float a, float b, float c, float d) {

        float min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;
        return min;
    }

    static float max(float a, float b, float c, float d) {

            float max = a;
            if (b > max)
                max = b;
            if (c > max)
                max = c;
            if (d > max)
                max = d;
            return max;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter three numbers");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            float f1,f2,f3,f4;
            f1 = a + b * c;
            f2 = c + a / b;
            f3 = a% b +c;
            f4 = a * b + c;
            System.out.println(f1+"\t"+f2+"\t"+f3+"\t"+f4);
            System.out.println("Min is\t" + min(f1,f2,f3,f4));
            System.out.println("Max is\t" + max(f1,f2,f3,f4));
        }
    }

