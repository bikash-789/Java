import java.util.*;
public class Q20 {

    public static void main(String[] args) {
        String names[] = new String[2];
        Scanner input = new Scanner(System.in);
        if(input.hasNext()) names[0] = input.nextLine();
        if(input.hasNext()) names[1] = input.nextLine();

        // compareTo function will return positive integer if left string is alphabetically greater than right string
        // returns negative integer if left string is alphabetically smaller than right
        if(names[0].compareTo(names[1]) > 0)
        {
            String temp = names[0];
            names[0] = names[1];
            names[1] = temp;
        }
        System.out.println(names[0] + " " + names[1]);
    }


}
