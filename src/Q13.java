public class Q13 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // default constructor
        s1.display();

        // One argument constructor
        Student s2 = new Student("20BCE2769");
        s2.display();

        // Two argument constructor
        Student s3 = new Student("20BCE2769", "Bikash Chauhan");
        s3.display();

        // Multi argument constructor
        int marks[] = {58, 43, 69, 45, 63};
        Student s4 = new Student("20BCE2769", "Bikash Chauhan", marks);
        s4.findAverage();
        s4.display();
    }
}

class Student{
    int marks[] = new int[5];
    String id;
    String name;
    double average;

    // Constructors

    Student()
    {
        this.id = null;
        this.name = null;
        this.average = 0;
    }

    // One argument based constructor
    Student(String id)
    {
        this.id = id;
    }

    // Two argument based constructor
    Student(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    // Multi arguments based constructor
    Student(String id, String name, int marks[])
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.average = 0;
    }

    // Member functions
    void findAverage()
    {
        double avg=0;
        for(int i=0; i<5; i++)
        {
            avg += (double)marks[i];
        }
        avg = avg / 5;
        this.average = avg;
    }

    void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.print("Marks: ");
        for(int i=0; i<5; i++)
        {
            System.out.print(this.marks[i]+" ");
        }
        System.out.println();
        System.out.println("Average: "+this.average);
    }
}