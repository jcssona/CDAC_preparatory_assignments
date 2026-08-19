package assignemntprograms;

import java.util.Scanner;

public class PalindromString {

    public static boolean palindromeCheck(String str)
    {
        int i = 0;
        int j = str.length()-1;

        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter a string : ");
        input = sc.nextLine();

        boolean result = palindromeCheck(input);

        if(result)
        {
            System.out.println("The given input string is palindrome!!!");
        }
        else
        {
            System.out.println("The given input string is not a palindrome!!!");
        }
    }
}
