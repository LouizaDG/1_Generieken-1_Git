package oefening1;

public class MagischeHoed <T extends Dier>{
	
	private T dier;
	private int teller;

	public MagischeHoed(T dier) {
		super();
		this.dier = dier;
	}
	
	public T kijkInHoed(){
		if(teller%2 < 1){
			System.out.println("Je kijkt in de hoed, er zit niets in.");
			teller++;
			return null;
		}else{
			System.out.println("Je kijkt in de hoed, er zit iets in.");
			teller++;
			return dier;
		}
	}
}
