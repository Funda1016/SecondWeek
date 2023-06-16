package SecondWeekArrayList;

import java.util.ArrayList;//objectin ustune gelip import yapiyorsun
import java.util.Arrays;
import java.util.Collections;

public class TestDriver {

	public static void main(String[] args) {
		Car car1=new Car("Ford");
		Car car2=new Car("GM");
		Car car3=new Car("Toyota");
		 ArrayList <Car> myArrayList3=new ArrayList<Car>();
		   myArrayList3.add(car1);	//member of list
		   myArrayList3.add(car2);	
		   myArrayList3.add(car3);
		   System.out.println(myArrayList3);
		   
		 
   ArrayList<Integer> myArrayList=new ArrayList<>(); //flexible string integer like java script
   ArrayList<String> myArrayList2=new ArrayList<>();// creating object
   myArrayList.add(3);	//member of list
   myArrayList.add(33);	
   myArrayList.add(333);
   System.out.println(myArrayList);
   myArrayList.remove(0);//icine index koyuyorsun //remove yapiyor
   System.out.println(myArrayList);
   System.out.println(myArrayList.get(0));	
   myArrayList2.add("Red");
   myArrayList2.add("Green");
   myArrayList2.add("Blue");
   Collections.sort( myArrayList2);
   System.out.println( myArrayList2);
   for(int i=0;i<myArrayList2.size();i++) {//ayri ayri print yapiyor
	   System.out.println(myArrayList2.get(i));
	   //print koydugunda yan yana koyuyor
   }
   
   
   
	}

}
