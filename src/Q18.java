public class Q18 {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(add("43","34"));
        System.out.println(add((long)(43), (long)(9838)));
        System.out.println(add((double)(34.34), (double)(22.44)));
        System.out.println(add((float)(3.3), (float)(4.04)));
        add(new Distance(5, 3), new Distance(12, 3)).print();
        add(new Complex(5, 6), new Complex(12, 1)).print();

    }

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int add(String a, String b)
    {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
    public static long add(long a, long b)
    {
        return a+b;
    }

    public static double add(double a, double b)
    {
        return a+b;
    }

    public static float add(float a, float b)
    {
        return a+b;
    }

    public static Distance add(Distance a, Distance b)
    {
        return new Distance(a.feet + b.feet, b.inches + a.inches);
    }

    public static Complex add(Complex a, Complex b)
    {
        return new Complex(a.real+b.real, a.img+b.img);
    }
}