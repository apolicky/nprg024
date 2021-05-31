package discussion;

/**
 * Nelíbí se mi situace, že mám visitovatelnou trídu, ta má v sobe normálne implementovanou metodu visit(),
 * 			TADY JE CHYBKA, TA BY MELA MIT accept METODU
 * co na sobe volá visitora a tak, všechno je v porádku. 
 * Jenže pak jí udelám potomka, toho chci brát zvlášt, ve visitorech pro nej pripravím
 * specielní metody a tak všechno, akorát v tom potomkovi zapomenu overridnout visit().  
 * O co mi jde, že to je jasná sémantická chyba, co je videt za kompilace
 * a v ideálním svete by rozhodne mela být detekovatelná, ale v každém normálním jazyce
 * to projde a bude se to pak chovat špatne. 
 * Takže jestli aspon v nejakém z klasických jazyku existuje mašinérie, skrze kterou by se proste dala metoda oznacit, že sice není abstraktní, ale i tak jí každý potomek musí prepsat?
 * 
 */

public class runner {
	
	public static void main(String[] args) {
	
		ConcreteVisitable1 cv = new ConcreteVisitable1();
		ChildOfConcreteVisitable1 cocv = new ChildOfConcreteVisitable1();
		VisitorInterface v = new HelloVisitor();
		
		cv.accept(v);
		cocv.accept(v);
		
	}
}
