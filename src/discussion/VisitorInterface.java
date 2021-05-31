package discussion;

public interface VisitorInterface {
	public void visit(Class<?> class1);
	public void visit(ConcreteVisitable1 cv);
	public void visit(ChildOfConcreteVisitable1 cocv);
}
