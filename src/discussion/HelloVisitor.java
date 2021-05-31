package discussion;

public class HelloVisitor implements VisitorInterface {

	@Override
	public void visit(ConcreteVisitable1 cv) {
		System.out.println("Hello to ConcreteVisitable");
	}

	@Override
	public void visit(ChildOfConcreteVisitable1 cocv) {
		System.out.println("Hello to ChildOfConcreteVisitable");
	}

	@Override
	public void visit(Class<?> class1) {
		System.out.println(class1.toString());
	}

}
