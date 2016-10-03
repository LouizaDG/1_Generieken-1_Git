package oefening4;

import java.util.ArrayList;
import java.util.List;

public class Omkeerder {
	
	public List<Integer> draaiIntegerListOm(List<Integer> list){
		List<Integer> omgedraaideList = new ArrayList<Integer>();
		for(int i = list.size()-1; i >= 0; i--){
			omgedraaideList.add(list.get(i));
		}
		return omgedraaideList;
	}
	
	public List<String> draaiStringListOm(List<String> list){
		List<String> omgedraaideList = new ArrayList<String>();
		for(int i = list.size()-1; i >= 0; i--){
			omgedraaideList.add(list.get(i));
		}
		return omgedraaideList;
	}
	
	public <T> List<T> draaiListOm(List<T> list){
		List<T> omgedraaideList = new ArrayList<T>();
		for(int i = list.size()-1; i >= 0; i--){
			omgedraaideList.add(list.get(i));
		}
		return omgedraaideList;
	}
	
}
