package oefening3;

public class Pair <T,U> {
	private T linkerwaarde;
	private U rechterwaarde;

	public Pair(T linkerwaarde, U rechterwaarde) {
		super();
		this.linkerwaarde = linkerwaarde;
		this.rechterwaarde = rechterwaarde;
	}
	
	public void toonJezelf(){
		System.out.println(getLinkerwaarde() + " + " + getRechterwaarde());
	}
	
	public T getLinkerwaarde() {
		return linkerwaarde;
	}

	public U getRechterwaarde() {
		return rechterwaarde;
	}
	
}
