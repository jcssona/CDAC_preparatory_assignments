package assignemntprograms;

import java.util.Scanner;

public class CharacterClassification {

    public static void classifyChar(String str)
    {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= 'A' && str.charAt(i) <='Z')
            {
                uppercaseCount++;
            }

            else if(str.charAt(i) >='a' && str.charAt(i) <='z')
            {
                lowercaseCount++;
            }

            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                digitCount++;
            }

            else
            {
                if(str.charAt(i) != ' ')
                    otherCount++;
            }
        }

        System.out.println("uppercaseCouunt : "+ uppercaseCount);
        System.out.println("lowercaseCount : "+ lowercaseCount);
        System.out.println("digitCount : "+ digitCount);
        System.out.println("otherCount : "+ otherCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter a string : ");
        input = sc.nextLine();

        classifyChar(input);
    }
}
