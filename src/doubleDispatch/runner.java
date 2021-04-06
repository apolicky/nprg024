package doubleDispatch;

public class runner {

    static void communicate(Person firstPerson, Person secondPerson) {
//        secondPerson.talkTo(firstPerson);
    }

    public static void main(String[] args) {
        Person czech = new Czech();
        Person czech2 = new Czech();
        Person polak = new Polak();

        czech.speak();
        polak.speak();

        czech.talkTo(polak);

        communicate(czech, polak);
        communicate(czech, czech2);
    }

}
