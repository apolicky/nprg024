package visitor;

public class MeetnGreetVisitor implements PatronVisitor {
    @Override
    public void visitTier0(PatronTier0 patronTier0) {
//    public void visit/*Tier0*/(visitor.PatronTier0 patronTier0) {
        System.out.println("Tier 0 patron gets invited on a regular meet&greet " +
                "every second Sunday");
    }

    @Override
    public void visitTier1(PatronTier1 patronTier1) {
//    public void visit(visitor.PatronTier1 patronTier1) {
        System.out.println("Tier 1 patron gets invited on a regular meet&greet " +
                "every Sunday");
    }

    @Override
    public void visitTier2(PatronTier2 patronTier2) {
//    public void visit(visitor.PatronTier2 patronTier2) {
        System.out.println("Tier 2 patron gets invited on a regular meet&greet " +
                "every Thursday and Sunday");
    }
}
