package PolymorphismAbstractInterface.AnimalImplement;

public class BigDog extends Dog{

    private String name;

    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets(){
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another){
        System.out.println("Woooooow");
    }

    public void greets(BigDog another){
        System.out.println("Woooooooooow");
    }
}
