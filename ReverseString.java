package assignemntprograms;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str)
    {
        char[] charray = str.toCharArray();

        int i = 0;
        int j = charray.length-1;

        while(i<j)
        {
            char temp;
            temp = charray[i];
            charray[i] = charray[j];
            charray[j] = temp;
            i++;
            j--;
        }

        return new String(charray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter a String input : ");
        input = sc.nextLine();

        String reversedInput = reverseString(input);

        System.out.println("After reversing the string is :"+ reversedInput);
    }
}
