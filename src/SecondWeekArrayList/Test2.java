package SecondWeekArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>number=new ArrayList<>();
number.add(2);
number.add(33);
number.add(333);
number.add(33);
number.add(111);
System.out.println(number);
int index=number.indexOf(2);
number.remove(index);
System.out.println(number);
Collections.sort(number);
System.out.println(number);
for(int i=0;i<number.size();i++) {
	System.out.println(number.get(i));
}

	}

}
