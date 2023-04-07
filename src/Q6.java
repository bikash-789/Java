import java.util.HashMap;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str="";
        if(input.hasNextLine())
        {
            str = input.nextLine();
        }

        String strArr[] = str.split("");
        HashMap<String, Integer> htable = new HashMap<>();

        for(int i=0; i<strArr.length; i++)
        {
            if(strArr[i].charAt(0) == ' ') continue;
            if(htable.containsKey(strArr[i]))
            {
                htable.put(strArr[i], htable.get(strArr[i])+1);
            }
            else htable.put(strArr[i], 1);
        }
        // Iterate over the keys in the hashtable
        int maxOcc = 0;
        String maxOccStr="";
        for (String key : htable.keySet()) {
            System.out.println(key + ": " + htable.get(key));
            if(maxOcc < htable.get(key))
            {
                maxOcc = htable.get(key);
                maxOccStr = key;
            }
        }

        // Find out the alphabet with maximum occurrences
        System.out.println("Maximum occurrence: "+maxOccStr);
    }
}
