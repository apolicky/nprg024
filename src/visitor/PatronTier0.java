package visitor;

public class PatronTier0 implements PatronInfce{

    @Override
    public void accept(PatronVisitor visitor) {
        visitor.visitTier0(this);
    }
}
