package CompositionAndInheritance.CircleAndCylinder;

public class Cylinder {

    private Circle base;
    private double height;

    public Cylinder(){
        base = new Circle();
        height = 1.0;
    }
}
