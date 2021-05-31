package doubleDispatch;

public class runner {

    public static void main(String[] args) {
        Person czech = new Czech();
//        Person czech2 = new Czech();
        Person pole = new Pole();

        czech.speak();
        pole.speak();

        czech.talkTo(pole);

    }

}
