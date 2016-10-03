package oefening2;

import java.util.ArrayList;
import java.util.List;

public class ListVuller {
	
	public List<Integer> vulList(int vulsel){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 20; i++){
			list.add(vulsel);
		}
		return list;
	}
	
	public <T> List<T> vulList(T vulsel){
		List<T> list = new ArrayList<T>();
		for(int i = 0; i < 20; i++){
			list.add(vulsel);
		}
		return list;
	}
}
