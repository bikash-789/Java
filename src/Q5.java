import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int vCount = 0, cCount = 0, dCount = 0, wCount = 0;
        Scanner input = new Scanner(System.in);
        String str = "";
        if (input.hasNextLine()) {
            str = input.nextLine();
        }
        String strArr[] = str.split("");
        for(int i=0; i<strArr.length; i++)
        {
            // check for whitespaces
            if((int)((strArr[i]).charAt(0)) == 32)
            {
                wCount++;
            }
            // check for digits
            if((int)((strArr[i]).charAt(0)) >= 48 && (int)((strArr[i]).charAt(0)) <= 57)
            {
                dCount++;
            }
            // check for vowels
            if(strArr[i].charAt(0) == 'a' || strArr[i].charAt(0) == 'e' || strArr[i].charAt(0) == 'i' ||strArr[i].charAt(0) == 'o' ||strArr[i].charAt(0) == 'u')
            {
                vCount++;
            }
            // check for consonants
            else
            {
                cCount++;
            }
        }
        System.out.println("Vowel count: "+vCount);
        System.out.println("Consonant count: "+cCount);
        System.out.println("Digit count: "+dCount);
        System.out.println("Whitespace count: "+wCount);
    }
}
