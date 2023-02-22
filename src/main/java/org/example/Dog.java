package org.example;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog dog1){
        System.out.println("Wooof");
    }

    @Override
    public String toString() {
        return "Class Dog{" +
                "name = " + super.getName() + '}';
    }



}
