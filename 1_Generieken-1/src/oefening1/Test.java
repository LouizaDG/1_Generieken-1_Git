package oefening1;

public class Test {

	public static void main(String[] args) {
		
		MagischeHoed<Konijn> hoed = new MagischeHoed<Konijn>(new Konijn("Fluffy"));
		
		MagischeHoed<Duif> hoed2 = new MagischeHoed<Duif>(new Duif("Pidgey"));
		
		Dier konijn;
		Dier duif;
		
		konijn = hoed.kijkInHoed();
		if(konijn != null){
			konijn.stelVoor();
		}
		
		duif = hoed2.kijkInHoed();
		if(duif != null){
			duif.stelVoor();
		}
	}
}
