package doubleDispatch;

public class Polak extends Person{
    @Override
    public void speak() {
        System.out.println("Jadę do Wrocławia.");
    }

    @Override
    public void talkTo(Person p) {
        p.talkTo(this);
    }

    @Override
    public void talkTo(Polak p) {
        System.out.println("Cześć.");
    }

    @Override
    public void talkTo(Czech c) {
        System.out.println("Dobrý den! Dzień dobry!");
    }
}
