import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        if(input.hasNextLine())
        {
            str = input.nextLine();
        }
        String nameArr[] = str.split(" ");
        if(nameArr.length == 0)
        {
            System.out.println("Invalid name!");
            return;
        }
        String abb = "";
        int i=0;
        for(; i<nameArr.length-1; i++)
        {
            abb += nameArr[i].charAt(0);
            abb += ".";
        }
        abb += nameArr[i];
        System.out.println(abb);
    }
}
