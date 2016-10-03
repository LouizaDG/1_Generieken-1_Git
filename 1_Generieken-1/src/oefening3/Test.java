package oefening3;

public class Test {
	
	public static void main(String[] args){
		
		Pair<Integer,String> stringPair = new Pair<Integer,String>(5, "peer");
		stringPair.toonJezelf();
		
		Pair<Integer, Pair<Integer,String>> dubbelPair = new Pair<Integer, Pair<Integer,String>>(5, stringPair);
		dubbelPair.toonJezelf();
		
		Point2D point = new Point2D(5,7);
		point.toonJezelf();
	}
	
	
}
