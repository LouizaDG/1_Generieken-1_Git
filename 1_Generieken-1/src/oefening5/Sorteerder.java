package oefening5;

import java.util.List;

public class Sorteerder {
	
	public Sorteerder() {
		super();
	}

	public <T extends Comparable<T>> List<T> sorteer(List<T> list){
		List<T> gesorteerdeList = list;
		T jMin;
		
		for (int i = 0; i < gesorteerdeList.size()-1; i++) {
			jMin = gesorteerdeList.get(i);
			for(int j = i+1; j < gesorteerdeList.size(); j++){
				if(gesorteerdeList.get(j).compareTo(jMin) < 0){
					T temp = jMin;
					jMin = gesorteerdeList.get(j);
					gesorteerdeList.set(i, jMin);
					gesorteerdeList.set(j, temp);
				}
			}
		}
		return gesorteerdeList;
	}
	
}
