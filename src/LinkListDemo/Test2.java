package LinkListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class Test2 {

	public static void main(String[] args) {
		LinkedList linkedList1=new LinkedList();
		linkedList1.add(2);
		linkedList1.add(3);
		linkedList1.add(10);
		linkedList1.add(7);
		System.out.println(linkedList1);
		LinkedList linkedList2=new LinkedList();
		linkedList2.add("Monday");
		linkedList2.add("Wednesday");
		linkedList2.add("Tuesday");
		linkedList2.add("Wednesday");
		System.out.println(linkedList2);
		for(int i=0; i<linkedList2.size();i++) {
			System.out.println(linkedList2.get(i));
		}
		System.out.println("-------------");
		linkedList2.remove("Wednesday");
		for(int i=linkedList2.size()-1;i>=0;i--) {
			System.out.println(linkedList2.get(i));
		}
	}

}
