package org.example;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woooow");
    }

    @Override
    public void greets(Dog dog2){
        System.out.println("Woooooow");
    }

    public void greets(BigDog bigDog1){
        System.out.println("Woooooooooooow");
    }

    @Override
    public String toString() {
        return "Class BigDog{" +
                "name = " + super.getName() + '}';
    }



}
