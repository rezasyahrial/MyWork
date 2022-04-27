package PolymorphismAbstractInterface.Shape;

public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side);
        String c = super.getColor();
        c = color;
        boolean b = super.isFilled();
        b = filled;
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return String.format("A Square with side = %f , which is a subclass of %s"
                , super.toString());
    }
}
