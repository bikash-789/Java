import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Q30 {
    public static void main(String[] args) {
        // Take input from user
        Donor donors[] = new Donor[4];
        donors[0] = new Donor("Bikash Chauhan", 22, "Birgunj, Nepal", "7091414844", "A+ve", LocalDate.of(2022, 5, 14));
        donors[1] = new Donor("Ayush Kanaujiya", 22, "Biratnagar, Nepal", "709XXXXXXX", "O+ve", LocalDate.of(2021, 3, 15));
        donors[2] = new Donor("Bhuwan Rathi", 21, "Biratnagar, Nepal", "7223343345", "B+ve", LocalDate.of(2020, 5, 4));
        donors[3] = new Donor("Ayush Yadav", 21, "Birgunj, Nepal", "7XXXXXXXX", "A+ve", LocalDate.of(2020, 8, 14));

        // Write into file
        try{
            FileOutputStream fos = new FileOutputStream("./Donors.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for(int i=0; i<4; i++)
            {
                oos.writeObject(donors[i]);
                oos.flush();
            }
            oos.close();
            fos.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        // Read from file
        try{
            FileInputStream fis = new FileInputStream("./Donors.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true)
            {
                try{
                    Donor d = (Donor) ois.readObject();
                    if(d.isEligible())
                    {
                        d.print();
                        System.out.println();
                    }
                }
                catch(EOFException e)
                {
                    break;
                }
            }
            ois.close();
            fis.close();
        }
        catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

class Donor implements Serializable{
    String name;
    int age;
    String address;
    String contactNo;
    String bloodGroup;
    LocalDate dateOfLastDonor;

    public Donor(String name, int age, String address, String contactNo, String bloodGroup, LocalDate date)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNo = contactNo;
        this.bloodGroup = bloodGroup;
        this.dateOfLastDonor = date;
    }

    boolean isEligible()
    {
        LocalDate diff = LocalDate.now().minus(6, ChronoUnit.MONTHS);
        return this.bloodGroup.equals("A+ve") && dateOfLastDonor.isBefore(diff);
    }

    void print()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Contact No.: "+contactNo);
        System.out.println("Last donated: "+this.dateOfLastDonor);
    }
}

