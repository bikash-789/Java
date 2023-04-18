import java.io.*;

public class Q32 {
    public static void main(String[] args) {

        // Serialization
        gfg_g1 obj = new gfg_g1("Bikash Chauhan", "abc123");
        try {
            FileOutputStream file = new FileOutputStream("./obj.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);
            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            FileInputStream file = new FileInputStream("./obj.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            gfg_g1 object = (gfg_g1) in.readObject();
            object.print();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException c)
        {
            c.printStackTrace();
        }
    }
}

class gfg_g1 implements Serializable {
    private String username;
    private transient String pwd;

    public gfg_g1(String username, String pwd)
    {
        this.username = username;
        this.pwd = pwd;
    }
    public void print()
    {
        System.out.println("Username: "+this.username);
        System.out.println("Password: "+this.pwd);
    }
}