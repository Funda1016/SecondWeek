package LinkListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList linkedList1=new LinkedList();
		 linkedList1.add(2);
		 linkedList1.add(5);
		 linkedList1.add(8);
		 System.out.println(linkedList1);
		 
		 ArrayList<Integer>numbers=new ArrayList<Integer>();
		 numbers.add(10);
		 numbers.add(20);
		 numbers.add(30);
		 System.out.println(numbers);
		 int index=numbers.indexOf(10);
		 numbers.remove(index);
		 System.out.println(numbers);
		 LinkedList linkedList2=new LinkedList();//for gibi calisiyor
		 linkedList2.add("Monday");
		 linkedList2.add("Tuesday");
		 linkedList2.add("Wednesday");

		 Iterator iterator=linkedList2.iterator();
		 while(iterator.hasNext()) {
		 	System.out.println(iterator.next());
		 	//System.out.println(iterator.next().toString().toUpperCase());
		 }
		 
	}

}
