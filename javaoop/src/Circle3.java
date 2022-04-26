

public class Circle3 {

    private double radius;
    private  String color;

    public Circle3(){
        radius = 1.0;
        color = "red";
    }

    public Circle3(double r){
        radius = r;
        color = "red";
    }

    public  double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Circle.Circle[radius=" + radius +"]";
    }

    public double getCircumference(){
        return 2.0 * radius * Math.PI;
    }
}
