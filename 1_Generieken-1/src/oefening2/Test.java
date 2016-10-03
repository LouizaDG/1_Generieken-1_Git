package oefening2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		ListVuller listVuller = new ListVuller();
		
		List<Integer> list = listVuller.vulList(5);
		List<String> list2 = listVuller.vulList("test");
		List<Integer> list3 = listVuller.vulList(5);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		for (String string : list2) {
			System.out.println(string);
		}
		
		for (Integer integer : list3) {
			System.out.println(integer);
		}

	}

}
