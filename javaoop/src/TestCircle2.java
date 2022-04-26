

public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(1.1, "blue");
        System.out.println(c1);
        Circle2 c2 = new Circle2(2.2);
        System.out.println(c2);
        Circle2 c3 = new Circle2();
        System.out.println(c3);

        //Test Setter and Getter
        c1.setRadius(3.3);
        c1.setColor("green");
        System.out.println(c1);
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());

        System.out.printf("The area is: %.2f%n", c1.getAre());
        System.out.printf("The circumference is: %.2f%n", c1.getCircumference());
    }
}
