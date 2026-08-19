package assignemntprograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateStrings {

    public static Set<String> removeDuplicateFromList(List<String> studNames)
    {
        Set<String> output = new LinkedHashSet<>(studNames);
        return output;
    }
    public static void main(String[] args) {
        List<String> studNames = new ArrayList<String>();
        studNames.add("Jay");
        studNames.add("Yash");
        studNames.add("Jay");
        studNames.add("Rahul");
        studNames.add("Dhiraj");
        studNames.add("Yash");


        Set<String> output = removeDuplicateFromList(studNames);

        for(String name : output)
        {
            System.out.print(name+" ");
        }
    }
}
