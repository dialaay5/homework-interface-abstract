package org.example;

public class GuitarPlayer extends Player{

    public GuitarPlayer(String name, String favoriteGenre) {
        super(name, favoriteGenre);
    }

    @Override
    public void getPlay() {
        System.out.println("Playing Hotel California...");

    }
    @Override
    public void getCompose() {
        System.out.println("composing guitar melody...");
    }

    public void rockAndRoll() {
        System.out.println("Let the show begin!!");
    }

    @Override
    public String toString() {
        return "Class GuitarPlayer : {" +
                "name= " + super.getName() +
                ", favoriteGenre= " + super.getFavoriteGenre() + '}';
    }
}
