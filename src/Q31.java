import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("./Bikash.txt");
            int x = 0;
            Scanner input = new Scanner(System.in);
            while(x<4){
                if(input.hasNextLine())
                {
                    String line = input.nextLine();
                    line += "\n";
                    byte byts[] = line.getBytes();
                    fos.write(byts);
                }
                x++;
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

