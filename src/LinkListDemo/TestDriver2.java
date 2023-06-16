package LinkListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class TestDriver2 {

	public static void main(String[] args) {
		
 LinkedList linkedList1=new LinkedList();
 linkedList1.add(2);
 linkedList1.add(5);
 linkedList1.add(8);
 System.out.println(linkedList1);
	
LinkedList linkedList2=new LinkedList();//for gibi calisiyor
linkedList2.add("Monday");
linkedList2.add("Tuesday");
linkedList2.add("Wednesday");

Iterator iterator=linkedList2.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
	//System.out.println(iterator.next().toString().toUpperCase());
}


for(int i=0;i<linkedList2.size();i++) {
System.out.println(linkedList2.get(i));
}
for(int i=linkedList2.size()-1;i>=0;i--) {//backward
System.out.println(linkedList2.get(i));
}

//System.out.println(linkedList2);
linkedList2.remove("Tuesday");
//System.out.println(linkedList2);
// TODO Auto-generated method stub
LinkedList<String>queueOne=new LinkedList<>();
queueOne.offer("Canada");
queueOne.offer("USA");
queueOne.offer("Mexico");
System.out.println(queueOne.remove());
System.out.println(queueOne.remove());
System.out.println(queueOne.remove());
	}

}
