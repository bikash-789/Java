import java.sql.SQLOutput;
import java.util.*;

public class Q3 {
    public static void main(String args[])
    {
        // a. To print string entered by user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = "";
        if(input.hasNextLine()) {
            str = input.nextLine();
        }
        System.out.println("Entered string: "+str);

        // b. To input and display the sentence "I Love VIT"
        System.out.print("Enter a sentence: ");
        if(input.hasNextLine())
        {
            str = input.nextLine();
        }
        System.out.println(str);

        // c. To find the length of the string "Computer"
        str = "Computer";
        System.out.println("The length of string 'Computer' is " + str.length());

        // d. To check if letter 'e' is present in the word 'wonderful'
        str = "wonderful";
        if(str.contains("e"))
        {
            System.out.println("'e' is present in 'wonderful' !");
        }
        else System.out.println("Absent!");

        // e. To check if the word chance is present in the "A Place to learn and a chance to grow"
        str = "A place to learn and a chance to grow";
        String strArr[] = str.split(" ");
        boolean isPresent = false;
        for(int i=0;i<strArr.length; i++)
        {
            if(strArr[i].equals("chance"))
            {
                isPresent = true;
                break;
            }
            else continue;
        }
        if(isPresent)
        {
            System.out.println("'chance' is present!");
        }
        else System.out.println("'chance' is absent!");

        // f. To find the first and last occurrence of the letter 'e' and character ',' in "Hello, world"
        str = "Hello, World";
        findFirstLastOccurrence(str, 'e');
        findFirstLastOccurrence(str, ',');
    }
    public static void findFirstLastOccurrence(String str, char x)
    {
        int first = -1, last = -1;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == x)
            {
                if(first != -1)
                {
                    last = i;
                }
                else first = i;
            }
        }
        if(first!=-1 && last == -1)
        {
            last = first;
            System.out.println("First: "+first+" and Last: "+last);
        }
        else
        {
            System.out.println("Character is not present in string!");
        }
    }

}
