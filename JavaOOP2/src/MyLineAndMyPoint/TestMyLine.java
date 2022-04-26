package MyLineAndMyPoint;

public class TestMyLine {

    public static void main(String[] args) {
        MyLine myLine = new MyLine(0, 0, 3, 4);
        System.out.println(myLine);

        MyPoint myPoint = new MyPoint(0, 0);
        MyPoint myPoint1 = new MyPoint(3, 4);
        MyLine myLine2   = new MyLine(myPoint, myPoint1);
        System.out.println(myLine2);

        System.out.println("Line 1 length: " + myLine.getLength());
        System.out.println("Line 1 gradient: " + myLine.getGradient());

        System.out.println("Line 2 length: " + myLine2.getLength());
        System.out.println("Line 2 gradient: " + myLine2.getGradient());
    }
}
