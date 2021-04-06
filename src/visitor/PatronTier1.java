package visitor;

public class PatronTier1 implements PatronInfce{
    @Override
    public void accept(PatronVisitor visitor) {
        visitor.visitTier1(this);
    }
}
