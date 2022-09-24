package Day2Assignment.SwitchCase;

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Alphabet: ");
        ch = sc.next().charAt(0);

        switch (ch)
        {
            case 'a':
                System.out.println("a is vowel" +ch);
                break;
            case 'e':
                System.out.println("e is vowel" +ch);
                break;
            case 'i':
                System.out.println("i is vowel" +ch);
                break;
            case 'o':
                System.out.println("o is vowel" +ch);
                break;
            case 'u':
                System.out.println("u is vowel" +ch);
                break;
            case 'A':
                System.out.println("A is vowel" +ch);
                break;
            case 'E':
                System.out.println("B is vowel" +ch);
                break;
            case 'I':
                System.out.println("B is vowel" +ch);
                break;
            case 'O':
                System.out.println("B is vowel" +ch);
                break;
            case 'U':
                System.out.println("B is vowel" +ch);
                break;
            default:
                System.out.println( "Alphabest is Consonant");
        }

    }
}
