public class Q19 {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        int weight = Integer.parseInt(args[2]);
        double height = Double.parseDouble(args[3]);

        // Calculate BMI
        double BMI = (weight / Math.pow(height, 2.0));

        // Formatting to only 2 decimal places
        System.out.println(firstName + " "+lastName);
        System.out.println("BMI: " + String.format("%.2f", BMI));
        if(BMI < 18.5)
        {
            System.out.println("Underweight");
        }
        else if(BMI>=18.5 && BMI < 25)
        {
            System.out.println("Normal (healthy weight)");
        }
        else if(BMI >= 25 && BMI < 30)
        {
            System.out.println("Overweight");
        }
        else System.out.println("Obese Class");
    }
}

