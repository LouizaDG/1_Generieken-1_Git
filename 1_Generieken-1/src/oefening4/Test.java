package oefening4;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Omkeerder omkeerder = new Omkeerder();
		
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("een");
		stringList.add("twee");
		stringList.add("drie");
		
		List<Double> doubleList = new ArrayList<Double>();
		doubleList.add(1.1);
		doubleList.add(2.2);
		doubleList.add(3.3);
		
		List<Integer> omgedraaideIntegerList = omkeerder.draaiIntegerListOm(integerList);
		print(omgedraaideIntegerList);
		
		List<String> omgedraaideStringList = omkeerder.draaiStringListOm(stringList);
		print(omgedraaideStringList);
		
		List<Integer> omgedraaideGenericIntegerList = omkeerder.draaiListOm(integerList);
		print(omgedraaideGenericIntegerList);
		
		List<String> omgedraaideGenericStringList = omkeerder.draaiListOm(stringList);
		print(omgedraaideGenericStringList);
		
		List<Double> omgedraaideGenericDoubleList = omkeerder.draaiListOm(doubleList);
		print(omgedraaideGenericDoubleList);
		
	}
	
	public static <T> void print(List<T> list)
	{
		for (T variable : list) {
			System.out.println(variable);
		}
	}

}
