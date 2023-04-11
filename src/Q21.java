import java.util.Scanner;
import java.lang.String;
public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String gangstaName = "";
        String nameArr[] = name.split(" ");
        gangstaName += nameArr[0].charAt(0) + "." + " Diddy ";
        gangstaName += nameArr[1].toUpperCase() +" ";
        gangstaName += nameArr[0] + "-izzle";
        System.out.println(gangstaName);
    }
}
