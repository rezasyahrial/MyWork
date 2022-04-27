package Inheritance.CircleAndCylinder;

public class Cylinder extends Circle{

    private double height = 1.0;

    public Cylinder(){
        super();
        height = 1.0;
    }

    public Cylinder(double radius){
        super(radius);
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()*height;
    }





}
