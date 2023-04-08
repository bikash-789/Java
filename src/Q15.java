public class Q15 {
    public static void main(String[] args) {
        // Create Distance objects
        Distance d1 = new Distance(5,6);
        Distance d2 = new Distance(4, 3);

        // Add d1 and d2
        d1.add(d2).print();
    }
}

class Distance{
    int feet;
    int inches;

    // Default Constructor
    Distance()
    {
        this.feet = 0;
        this.inches = 0;

    }

    // Parameterized constructor
    Distance(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }

    // Member functions
    void print()
    {
        System.out.println("Feet: "+this.feet +", Inches: "+this.inches);
    }

    Distance add(Distance d)
    {
        Distance added = new Distance(this.feet + d.feet, this.inches + d.inches);
        return added;
    }
}