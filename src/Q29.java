public class Q29 {
    public static void main(String[] args) {
        Students a = new Students(35, 32, 77);
        Students b = new Students(34, 29, 88);

        Thread t1 = new Thread()
        {
            public void run()
            {
                int total = 0;
                synchronized (a)
                {

                    System.out.println("Thread-1 has hold on first subject marks!");

                    // Calculating total for first subject marks
                    total += a.cat1;
                    total += a.cat2;
                    total += a.fat;

                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e){e.printStackTrace();}

                    synchronized (b)
                    {
                        System.out.println("Thread-2 has hold on second subject marks!");

                        total += b.cat1;
                        total += b.cat2;
                        total += b.fat;
                    }
                    // Calculate the average marks
                    total = total/2;
                    System.out.println("Average marks: "+total);
                }
            }
        };


        Thread t2 = new Thread()
        {
            public void run()
            {
                int total = 0;
                synchronized (b)
                {
                    System.out.println("Thread-2 has hold on second subject marks!");

                    // Calculating total for subject-2 marks
                    total += b.cat1;
                    total += b.cat2;
                    total += b.fat;

                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){e.printStackTrace();}

                    synchronized (a)
                    {
                        System.out.println("Thread-2 has hold on first subject marks!");

                        total += a.cat1;
                        total += a.cat2;
                        total += a.fat;
                    }
                    // Calculating the average marks
                    total = total/2;
                    System.out.println("Average marks: "+total);
                }
            }
        };

        t1.start();
        t2.start();
    }
}

class Students{
    int cat1, cat2, fat;
    Students(int a, int b, int c)
    {
        this.cat1 = a;
        this.cat2 = b;
        this.fat = c;
    }

}

