package visitor;

public class PatronTier2 implements PatronInfce {
    @Override
    public void accept(PatronVisitor visitor) {
        visitor.visitTier2(this);
    }
}
