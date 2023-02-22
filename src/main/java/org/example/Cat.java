package org.example;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Class Cat{" +
                "name = " + super.getName() + '}';
    }

}
