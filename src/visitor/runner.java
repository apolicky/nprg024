package visitor;

public class runner {

    public static void main(String[] args){

        PatronInfce[] patrons = {
                new PatronTier0(),
                new PatronTier1(),
                new PatronTier2()
        };

        PatronVisitor visitor = new LiveStreamFeatureVisitor();

        for(PatronInfce p : patrons) {
            p.accept(visitor);
        }

    }

}
