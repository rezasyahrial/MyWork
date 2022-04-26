

public class TestCircle3 {
    public static void main(String[] args) {
        Circle3 c1 = new Circle3(1.1);
        System.out.println(c1);
        Circle3 c2 = new Circle3();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1.toString());
        System.out.println("radius is: " + c1.getRadius());

        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());

    }
}
