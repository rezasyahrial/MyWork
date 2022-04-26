package MyCircleAndMyPoint;

public class TestMyCircle {

    public static void main(String[] args) {
        MyCircle c = new MyCircle(3,4,1);
        System.out.println(c);

        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        c.setCenterX(2);
        c.setCenterY(3);
        System.out.println(c);

        c.setCenterXY(4,5);
        System.out.println(c);

        c.setCenter(c.getCenter());

        System.out.println("Center x: " + c.getCenterX());
        System.out.println("Center y: " + c.getCenterY());
        System.out.println(c.getCenterXY()[0]);
        System.out.println(c.getCenterXY()[1]);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
        System.out.println("Distance: " + c.distance(c1));
    }


}
