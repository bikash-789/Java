import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
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
            System.out.println("Written successfully!");
            input.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        // Now read the file and count the frequency of each word
        try{
            Scanner input = new Scanner(new FileInputStream("./Bikash.txt"));
            String str="";
            while(input.hasNext())
            {
                str+=input.nextLine()+" ";
            }
            // Create an array to store string tokens
            String strArr[] = str.split(" ");

            // Create a hashMap
            HashMap<String, Integer> freqCount = new HashMap<>();

            // Store words into HashMap with corresponding frequency count
            for(int i=0; i < strArr.length; i++)
            {
                if(freqCount.containsKey(strArr[i]))
                {
                    int k = freqCount.get(strArr[i]);
                    freqCount.put(strArr[i], ++k);
                }
                else{
                    freqCount.put(strArr[i], 1);
                }
            }
            // Iterate over HashMap and print frequency of each word
            freqCount.forEach((key, value)->{
                System.out.println(key + ": "+value);
            });
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}

