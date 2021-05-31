package doubleDispatch;

public class Person {

    public void speak() {
        System.out.println("Person speaks undefined language.");
    }

    public void talkTo(Person p) {
        System.out.println("Undefined sounds between two people in undefined language.");
    }

    public void talkTo(Pole p) {
        System.out.println("Person talks to Pole in undefined language.");
    }

    public void talkTo(Czech c) {
        System.out.println("Person talks to Czech about beer in undefined language.");
    }
}
