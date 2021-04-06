package visitor;

public interface PatronVisitor {

    public void visitTier0(PatronTier0 patronTier0);
    public void visitTier1(PatronTier1 patronTier1);
    public void visitTier2(PatronTier2 patronTier2);


//    public void visit(visitor.PatronTier0 patronTier0);
//    public void visit(visitor.PatronTier1 patronTier1);
//    public void visit(visitor.PatronTier2 patronTier2);

}
