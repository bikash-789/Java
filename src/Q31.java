import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) throws InterruptedException{
// PART-A
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

// PART-B
        try{
            PipedInputStream in = new PipedInputStream();
            PipedOutputStream out = new PipedOutputStream(in);

            // Create a thread to read a file and filter the word "Good"
            Thread filterThread = new Thread(()->{
                try
                {
                    BufferedReader bfr = new BufferedReader(new FileReader("./Bikash.txt"));
                    String line;
                    while((line = bfr.readLine()) != null)
                    {
                        String words[] = line.split(" ");
                        for(String word : words)
                        {
                            if(!word.equalsIgnoreCase("Good"))
                            {
                                out.write((word+ " ").getBytes());
                            }
                        }
                    }
                    bfr.close();
                    out.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            });

            // Create a thread to read the content from the PipedInputStream and display it
            Thread displayThread = new Thread(()->{
                try
                {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while((bytesRead = in.read(buffer)) != -1)
                    {
                        System.out.print(new String(buffer, 0, bytesRead));
                    }
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            });


            // Start both threads
            filterThread.start();
            displayThread.start();

            // Wait for both threads to finish
            filterThread.join();
            displayThread.join();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}

