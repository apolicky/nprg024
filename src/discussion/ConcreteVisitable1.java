package discussion;

public class ConcreteVisitable1 implements VisitableInterface {

	@Override
	public void accept(VisitorInterface visitor) {
		// co na sobe volá visitora a tak, všechno je v porádku.
		
		System.out.println();
		visitor.visit(this);
	}

}
