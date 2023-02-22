package org.example;

public class Main {
    public static void main(String[] args) {

     System.out.println("Hello world!");

     MovePoint move = new MovePoint(20,30,4,5);
     System.out.println(move);
     System.out.println("moveDowm = " + move.moveDown());
     System.out.println("moveUp = " + move.moveUp());
     System.out.println("moveLeft = " + move.moveLeft());
     System.out.println("moveRight = " + move.moveRight());


     Cat cat = new Cat("max");
     System.out.println(cat);
     cat.greets();

     System.out.println(" ");


     Dog dog = new Dog("roxy");
     System.out.println(dog);
     dog.greets();

     System.out.println(" ");


     Dog dog1 = new Dog("Bella");
     System.out.println(dog1);
     dog.greets(dog1);

     System.out.println(" ");


     BigDog bigDog = new BigDog("locy");
     System.out.println(bigDog);
     bigDog.greets();

     System.out.println(" ");


     Dog dog2 = new Dog("Milo");
     System.out.println(dog2);
     bigDog.greets(dog2);

     System.out.println(" ");

     BigDog bigDog1 = new BigDog("Cooper");
     System.out.println(bigDog1);
     bigDog.greets(bigDog1);

     System.out.println(" ");

     System.out.println("An interface that does not have any methods, fields, or constants, an empty interface in java is known as Marker Interface.\n" +
             "It is used to deliver type information at runtime to the JVM so that it can take some action based on the information received.\n");

     System.out.println("Abstract class vs Interface :- \n" +
             "* Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods.\n" +
             "* Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.\n" +
             "* A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.\n" +
             "* Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected.\n");

     System.out.println("Using abstract classes if any of these statements apply:-\n" +
             "In the java application, there are some related classes that need to share some lines of code then you can put these lines of code within the abstract class and this abstract class should be extended by all these related classes.\n" +
             "You can define the non-static or non-final field(s) in the abstract class so that via a method you can access and modify the state of the object to which they belong.\n" +
             "You can expect that the classes that extend an abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).\n");

     System.out.println("Using interfaces if any of these statements apply:-\n" +
             "It is a total abstraction, All methods declared within an interface must be implemented by the class(es) that implements this interface.\n" +
             "A class can implement more than one interface. It is called multiple inheritances.\n" +
             "You want to specify the behavior of a particular data type but are not concerned about who implements its behavior.\n");

     GuitarPlayer guitarist = new GuitarPlayer("dany", "Salsa music");
     System.out.println(guitarist);

     PianoPlayer pianist = new PianoPlayer("tal", "Classical music");
     System.out.println(pianist);

     Player[] players = {guitarist,pianist};

     startMusicShow(players[0]);
     System.out.println(" ");
     startMusicShow(players[1]);

    }

 static void startMusicShow(Player players){
  players.getPlay();

     if(players.getClass() == GuitarPlayer.class){
      ((GuitarPlayer)players).rockAndRoll();
     }
     else if(players.getClass() == PianoPlayer.class){
      ((PianoPlayer)players).playJazz();
     }
 }



}