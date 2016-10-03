package oefening1;

public abstract class Dier {
	
	private String naam;

	public Dier(String naam) {
		super();
		this.naam = naam;
	}
	
	public abstract void stelVoor();
	
	protected void stelVoor(String diersoort){
		// strings met equals vergelijken, "Duif" vgl met diersoort zodat je geen null pointer exception kunt gebruiken
		if("Duif".equals(diersoort)){
			System.out.printf("Ik ben %s de duif.\n", getNaam());
		}else{
			if("Konijn".equals(diersoort)){
				System.out.printf("Ik ben %s het konijn.\n", getNaam());
			}
		}
	}

	public String getNaam() {
		return naam;
	}
}
