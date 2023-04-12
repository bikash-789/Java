public class Q23 {
    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(5, 7);
        Line l = new Line(a,b);
        System.out.println(l.findDistance());
    }
}

class Point{
    int x;
    int y;

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Geometry{
    Point p;
    Geometry(Point p)
    {
        this.p = p;
    }
}

class Line extends Geometry{
    Point q;
    Line(Point p, Point q)
    {
        super(p);
        this.q = q;
    }
    // Find the distance between points
    double findDistance()
    {
        double x = Math.pow(this.q.x - this.p.x, 2);
        double y = Math.pow(this.q.y - this.p.y, 2);
        return Math.sqrt(x+y);
    }
}