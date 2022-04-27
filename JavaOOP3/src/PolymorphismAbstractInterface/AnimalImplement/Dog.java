package PolymorphismAbstractInterface.AnimalImplement;

public class Dog extends Animal{

    private String name;

    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another){
        System.out.println("Wooof");
    }
}
