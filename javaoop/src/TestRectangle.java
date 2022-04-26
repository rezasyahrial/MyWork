

public class TestRectangle {
    public static void main(String[] args) {
        RectangleClass r1 = new RectangleClass(1.2f, 3.4f);
        System.out.println(r1);
        RectangleClass r2 = new RectangleClass();
        System.out.println(r2);

        r1.setLength(5.6f);
        r1.setWidht(7.8f);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidht());

        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }


}
