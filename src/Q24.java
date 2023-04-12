public class Q24 {
    public static void main(String[] args) {
        Circle c = new Circle(2.4);
        Rectangle r = new Rectangle(4, 5.3);
        Triangle t = new Triangle(12,2 );
        System.out.println("Area of circle: "+c.area());
        System.out.println("Area of rectangle: "+r.area());
        System.out.println("Area of triangle:"+t.area());
    }
}

abstract class Shape{
    public abstract double area();
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double area() {
        double ar = 3.14 * Math.pow(this.radius, 2);
        return ar;
    }
}

class Triangle extends Shape{
    private double height;
    private double base;
    public Triangle(double b, double h)
    {
        this.base = b;
        this.height = h;
    }
    public double area()
    {
        return 0.5*this.base*this.height;
    }
}

class Rectangle extends Shape{
    private double length;
    private double breadth;

    Rectangle(double l, double b)
    {
        this.length = l;
        this.breadth = b;
    }

    public double area()
    {
        return this.length * this.breadth;
    }
}