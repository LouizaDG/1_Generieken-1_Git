package oefening5;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Sorteerder sorteerder = new Sorteerder();
		List<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(3);
		list.add(300);
		list.add(5);
		list.add(6);
		List<Integer> gesorteerdeList = sorteerder.sorteer(list);
		
		for (Integer integer : gesorteerdeList) {
			System.out.println(integer);
		}

	}

}
