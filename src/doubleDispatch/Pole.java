package doubleDispatch;

public class Pole extends Person{
    @Override
    public void speak() {
        System.out.println("Dzień dobry!");
    }

    @Override
    public void talkTo(Person p) {
        p.talkTo(this);
    }

    @Override
    public void talkTo(Pole p) {
        System.out.println("Cześć.");
    }

    @Override
    public void talkTo(Czech c) {
        System.out.println("Dobrý den! Dzień dobry!");
    }
}
