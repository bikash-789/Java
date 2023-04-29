import java.util.*;
public class Q34 {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Object>> pupil = new HashMap<>();
        HashMap<Integer, ArrayList<Object>> classT = new HashMap<>();

        // Add data to pupil map
        ArrayList<Object> row1 = new ArrayList<>();
        row1.addAll(Arrays.asList("Bob", "Jones", 1));
        pupil.put(1, row1);

        ArrayList<Object> row2 = new ArrayList<>();
        row2.addAll(Arrays.asList("Bill", "Jones", 2));
        pupil.put(2, row2);

        ArrayList<Object> row3 = new ArrayList<>();
        row3.addAll(Arrays.asList("Fred", "Jones", 1));
        pupil.put(3, row3);


        // Add data to classT map
        ArrayList<Object> row4 = new ArrayList<>();
        row4.addAll(Arrays.asList("CompSci 101", "S16"));
        classT.put(1, row4);

        ArrayList<Object> row5 = new ArrayList<>();
        row5.addAll(Arrays.asList("English 101",  "M42"));
        classT.put(2, row5);
        System.out.println("Pupil Table");
        // Now traverse to see the table
        pupil.forEach((key, value)->{
            System.out.println(key + " " + value.toString());
        });

        System.out.println("\nClass Table");
        // Now traverse to see the table
        classT.forEach((key, value)->{
            System.out.println(key + " " + value.toString());
        });

        System.out.println("\nUpdated Pupil Table");
        // Traverse and replace firstName of pupil with their class name
        pupil.forEach((key, value)->{
            ArrayList<Object> val = value;
            Integer classId = (Integer)(value.get(2));
            ArrayList<Object> classTable = classT.get(classId);
            value.set(0, classTable.get(0));
        });

        // Now traverse to see the result
        pupil.forEach((key, value)->{
            System.out.println(key + " " + value.toString());
        });
    }
}
