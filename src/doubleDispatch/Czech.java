package doubleDispatch;

public class Czech extends Person{
    @Override
    public void speak() {
        System.out.println("Dobrý den, celý den, bába letí komínem.");
    }

    @Override
    public void talkTo(Person p) {
        p.talkTo(this);
    }

    @Override
    public void talkTo(Pole p) {
        System.out.println("Dobrý den! Dzień dobry!");
    }

    @Override
    public void talkTo(Czech c) {
        System.out.println("Nazdraví [české cinknutí].");
    }

}
