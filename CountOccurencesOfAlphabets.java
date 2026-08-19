package assignemntprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurencesOfAlphabets {

    public static Map<Character,Integer> countOccurrOfEachChar(String input)
    {
        char[] charArr = input.toCharArray();
        Map<Character,Integer> recordMap = new LinkedHashMap<>();
        for(int i=0;i<charArr.length;i++)
        {
            char ch = Character.toLowerCase(charArr[i]);
            if((ch >= 'a' && ch <= 'z'))
            {
                recordMap.put(ch,recordMap.getOrDefault(ch,0)+1);
            }
        }

        return recordMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter a String : ");
        input = sc.nextLine();

        Map<Character,Integer> output = countOccurrOfEachChar(input);


        for(Map.Entry<Character,Integer> entry : output.entrySet())
        {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
