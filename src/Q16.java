public class Q16 {
    public static void main(String[] args) {
        // Create two objects of Complex
        Complex c1 = new Complex(5, 6);
        Complex c2 = new Complex(4, 6);

        // This will add c1 and c2 and return the resultant Complex object
        c1.add(c2).print();
    }
}

class Complex{
    int real;
    int img;

    // Constructors
    Complex()
    {
        this.real = 0;
        this.img = 0;
    }

    Complex(int real, int img)
    {
        this.real = real;
        this.img = img;
    }

    // Function to add complex class
    Complex add(Complex c)
    {
        return new Complex(this.real+c.real, this.img+c.img);
    }

    void print()
    {
        System.out.println(this.real+"+"+this.img+"𝑖");
    }
}