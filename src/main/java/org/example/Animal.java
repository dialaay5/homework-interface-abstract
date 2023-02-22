package org.example;

import lombok.Getter;
import lombok.Setter;

public abstract class Animal implements IGreet{
    @Getter
    @Setter
    protected String name;
    public Animal(String name){
        this.name = name;
    }

    public abstract void greets();

}
