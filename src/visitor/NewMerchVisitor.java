package visitor;

public class NewMerchVisitor implements PatronVisitor {
    @Override
    public void visitTier0(PatronTier0 patronTier0) {
        System.out.println("Tier 0 patron gets 1 free merchandise item for his B-day");
    }

    @Override
    public void visitTier1(PatronTier1 patronTier1) {
        System.out.println("Tier 1 patron gets 1 SIGNED free merchandise item for his B-day");
    }

    @Override
    public void visitTier2(PatronTier2 patronTier2) {
        System.out.println("Tier 2 patron gets 1 free merchandise item for his B-day " +
                "and gets to choose one day with the creator");
    }
}
