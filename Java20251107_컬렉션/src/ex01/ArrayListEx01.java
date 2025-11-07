package ex01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx01 {

	public static void main(String[] args) {

		// int > Integer
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(50); // new Integer(5) 5 > new Integer(5) > wapper
		list.add(new Integer(40));
		list.add(20);
		list.add(new Integer(0));
		list.add(10);
		list.add(new Integer(30));
		
		System.out.println(list);
		System.out.println(list.subList(1, 4));
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(2, 5));
		System.out.println(list2);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		
		int num = list.get(2);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("kor");
		list3.add("eng");
		list3.add("math");
		System.out.println(list3);
		
		String str = list3.get(2);
	}

}
