package assignemntprograms;

import java.util.Scanner;

public class FindMaximumNumber {

    public static int maxNumber(String[] number)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            int ele = Integer.parseInt(number[i]);
            if(ele > max)
            {
                max = ele;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        if(args.length == 0)
        {
            System.out.println("No element passed as an input. Please enter at least one element in input command line ");
            return;
        }
        System.out.println("Maximum number is : "+maxNumber(args));;

    }
}
