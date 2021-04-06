package visitor;

public class LiveStreamFeatureVisitor implements PatronVisitor {
    @Override
    public void visitTier0(PatronTier0 patronTier0) {
        System.out.println("Tier 0 patron gets 1 new chat emoticon.");
    }

    @Override
    public void visitTier1(PatronTier1 patronTier1) {
        System.out.println("Tier 1 patron gets 3 new chat emoticons and gets to ask a question.");
    }

    @Override
    public void visitTier2(PatronTier2 patronTier2) {
        System.out.println("Tier 2 patron gets 5 new chat emoticons,\n" +
                "      gets to ask as many question as he wants and can fiddle with the background.");
    }
}
