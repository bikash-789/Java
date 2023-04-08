public class Q17 {
    public static void main(String[] args) {
        byte n1 = (byte)(2);
        short n2 = (short)(3);
        int n3 = 13;
        long n4 = 141444;
        float n5 = (float)(23.34);
        double n6 = 5634.34;
        System.out.println(square(n1));
        System.out.println(square(n2));
        System.out.println(square(n3));
        System.out.println(square(n4));
        System.out.println(square(n5));
        System.out.println(square(n6));
        System.out.println(square());
    }
    public static byte square(byte num)
    {
        return (byte)(num*num);
    }

    public static short square(short num)
    {
        return (short)(num*num);
    }

    public static int square(int num)
    {
        return num*num;
    }

    public static long square(long num)
    {
        return num*num;
    }

    public  static float square(float num)
    {
        return num*num;
    }

    public static double square(double num)
    {
        return num*num;
    }

    public static int square()
    {
        return 1;
    }
}

