package PolymorphismAbstractInterface.AnimalImplement;

public class Cat extends Animal{

    private String name;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
