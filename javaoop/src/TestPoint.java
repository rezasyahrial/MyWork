

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(5, 8);
        System.out.println(point);

        Point point1 = new Point();
        System.out.println(point1);

        point.setX(5);
        point.setY(8);
        System.out.println(point);
        System.out.println("Nilai X adalah " + point.getX());
        System.out.println("Nilai Y adalah " + point.getY());

        point.setXY(5,8);
        System.out.println(point);
        System.out.println("Nilai X adalah " + point.getXY()[0]);
        System.out.println("Nilai Y adalah " + point.getXY()[1]);

        point.setXY(10, 11);
        System.out.printf("\nDistance is: %.2f%n", point.distance(10, 11));
        //Distance is: 7.07
        System.out.printf("Distance is: %.2f%n", point.distance(point1));
        //Distance is: 7.07
        System.out.printf("Distance is: %.2f%n", point1.distance(point1));
        //Distance is: 7.07
        System.out.printf("Distance is: %.2f%n", point.distance());
        //Distance is: 7.81

    }


}
