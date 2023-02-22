package org.example;

public class PianoPlayer extends Player{

    public PianoPlayer(String name, String favoriteGenre) {
        super(name, favoriteGenre);
    }

    @Override
    public void getPlay() {
        System.out.println("Playing Bach...");
    }

    @Override
    public void getCompose() {
        System.out.println("composing piano melody...");
    }

    public void practice() {
        System.out.println("practice makes perfect!!");
    }

    public void playJazz() {
        System.out.println("Playing I Got Rhythm by George Gershwin!!");
    }

    @Override
    public String toString() {
        return "Class PianoPlayer : {" +
                "name= " + super.getName() +
                ", favoriteGenre= " + super.getFavoriteGenre() + '}';
    }
}
