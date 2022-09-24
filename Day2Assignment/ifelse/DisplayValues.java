package Day2Assignment.ifelse;
import java.util.Scanner;
public class DisplayValues {
        public static void main(String[] args)
        {
            //Create new scanner
            Scanner sc = new Scanner(System.in);

            //Values of each digit
            int hundreds = 0;
            int tens = 0;
            int unit = 0;

            //Prompt user to input 3 digit number
            System.out.println("Enter a 3 digit number: ");
            int number = sc.nextInt();

            if (number <= 999 && number > 99)   // Checking condition for three digit number
            {

                //Display hundreds place digit
                hundreds = number / 100;
                System.out.println("Hundreds place digit: " + hundreds);

                //Display tens digit
                tens = (number - (hundreds*100)) / 10;
                System.out.println("Tens place digit: " + tens);


                //Display unit digit
                unit = (number - (tens*10) - (hundreds*100));
                System.out.println("Unit place digit: " + unit);
            }
            //Error if number is less or more then three digits
            else
            {
                if (number > 999)
                    System.out.println("Error! Number more then 3 digits.");
                if (number < 100)
                    System.out.println("Error! Number less then 3 digits.");
            }



        }
    }
