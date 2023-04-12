public class Q25 {
    public static void main(String[] args) {
        SuperBird s = new SuperBird();
        s.move();
    }
}

interface Bird{
    default void move()
    {
        System.out.println("The bird moves.");
    }
}

interface FlyingBird extends Bird{
    @Override
    default void move()
    {
        System.out.println("The flying bird moves.");
    }
}

interface SwimmingBird extends Bird{
    @Override
    default void move()
    {
        System.out.println("The swimming bird moves.");
    }
}

class SuperBird implements FlyingBird, SwimmingBird{
    // no need to define move()

    @Override
    public void move() {
        // Here, we're saying which move method should call this class.
        FlyingBird.super.move();
        // Hence, diamond problem is solved
    }
}
