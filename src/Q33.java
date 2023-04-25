import java.util.*;

/*
Input Format:

Enter number of courses offered: 7
Enter faculty ID: 111
Enter course handled by 111: Python
Enter faculty ID: 222
Enter course handled by 222: Maths
Enter faculty ID: 333
Enter course handled by 333: C
Enter faculty ID: 444
Enter course handled by 444: C++
Enter faculty ID: 555
Enter course handled by 555: Physics
Enter faculty ID: 666
Enter course handled by 666: Chemistry
Enter faculty ID: 777
Enter course handled by 777: DigitalElectronics
Enter number of students: 3
Enter student name: A
Enter number of courses registered by A3
Enter courses (separated by space): Python Maths C
Enter student name: B
Enter number of courses registered by B2
Enter courses (separated by space): C C++
Enter student name: C
Enter number of courses registered by C3
Enter courses (separated by space): C++ Physics Chemistry

Enter student name: B


Sample Input:
7
111
Python
222
Maths
333
C
444
C++
555
Physics
666
Chemistry
777
DigitalElectronics
3
A
3
Python Maths C
B
2
C C++
C
3
C++ Physics Chemistry
A
* */

public class Q33 {
    public static void main(String[] args) throws MaximumCourseError{
        Scanner input = new Scanner(System.in);
        // Maximum of 3 courses allowed
        int courseCount = 0;
        // h1 is a hashmap with 'n' key value pairs
        // key - names of student
        // value - courses registered by them
        HashMap<String, ArrayList<String>> h1 = new HashMap<>();


        // h2 - another hashmap with 'm' key value pairs
        // key - names of course
        // value - name of faculty handling the course
        HashMap<String, Integer> h2 = new HashMap<>();

        // Add/Remove student from h1
        // Iterate over h1 and h2 and display values stored in them
        // Given a student name, fetch all the courses registered by him/her

        // Let's take input from user for Course details
        int m = input.nextInt();
        int facultyID = 0;
        String courseName = "";
        while(m>0)
        {
            if(input.hasNextInt())
            {
                facultyID = input.nextInt();
                input.nextLine();
            }
            if(input.hasNextLine())
            {
                courseName = input.nextLine();
            }
            // Now add FacultyID and courseName as key-value pair
            h2.put(courseName, facultyID);
            m--;
        }

        // Let's take input from user for Student details
        int n = input.nextInt();
        input.nextLine();

        String studentName = "";
        int numOfCourse = 0;
        while(n>0)
        {
            if(input.hasNextLine())
            {
                studentName = input.nextLine();
            }

            if(input.hasNextInt())
            {
                numOfCourse = input.nextInt();
            }
            input.nextLine();
            if(numOfCourse > 3) throw new MaximumCourseError("More than 3 courses is not allowed!");

            if(input.hasNextLine())
            {
                courseName = input.nextLine();
            }
            String courses[] = courseName.split(" ");
            ArrayList<String> c = new ArrayList<>();
            c.addAll(Arrays.asList(courses));

            // Now add to h1
            h1.put(studentName, c);
            n--;
        }
        System.out.println("");
        if(input.hasNextLine())
        {
            studentName = input.nextLine();
        }
        System.out.println("");
        // Now iterate over the hashMap
        System.out.println("Courses registered by "+studentName+": "+h1.get(studentName));
        System.out.print("The faculty that teach "+studentName + ": ");
        ArrayList<String> coursesRegistered = new ArrayList<>();
        coursesRegistered = h1.get(studentName);

        coursesRegistered.forEach(item->{
            System.out.print(h2.get(item)+ ", ");
        });
    }
}

class MaximumCourseError extends Exception{
    MaximumCourseError(String message)
    {
        super(message);
    }
}
