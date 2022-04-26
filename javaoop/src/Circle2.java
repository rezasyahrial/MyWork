

public class Circle2 {

    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "red";

    private double radius;
    private String color;

    public Circle2(){
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    public Circle2(double radius){
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }

    public Circle2(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public  double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Circle.Circle[radius=" + radius + ", color=" + color + "]";
    }

    public double getAre(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2.0 * radius * Math.PI;
    }
}
