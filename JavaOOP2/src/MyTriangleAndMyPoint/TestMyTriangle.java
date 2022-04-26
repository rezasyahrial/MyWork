package MyTriangleAndMyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {

        MyTriangle t = new MyTriangle(3,2,3,2,2,2);
        System.out.println(t);

        MyPoint a = new MyPoint(2,2);
        MyPoint b = new MyPoint(2,2);
        MyPoint c = new MyPoint(2,2);
        MyTriangle t2 = new MyTriangle(a,b,c);

        MyTriangle t3 = new MyTriangle(1,2,3,4,5,6);
        System.out.println(t3);

        System.out.println("Perimeter Triangle1: " + t.getPerimeter());
        System.out.println("Type Triangle1: " + t.getType());

        System.out.println("Perimeter Triangle2: " + t2.getPerimeter());
        System.out.println("Type Triangle2: " + t2.getType());

        System.out.println("Perimeter Triangle3: " + t3.getPerimeter());
        System.out.println("Type Triangle3: " + t3.getType());


    }
}
