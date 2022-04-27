package PolymorphismAbstractInterface.InterfaceResizable;

public class ResizeableCircle extends Circle implements Resizeable{


    public ResizeableCircle(double radius) {
        super(radius);
    }

    public String toString(){
        return "ResizeableCircle[" + super.toString() + "]";
    }

    @Override
    public void resize(int percent) {
      radius *= percent/100.0;
    }
}
