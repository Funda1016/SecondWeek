package SecondWeekArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		Car car1=new Car("Ford");
		Car car2=new Car("GM");
		Car car3=new Car("Toyota");
		ArrayList<Car>carList=new ArrayList<Car>();
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		System.out.println(carList);
		
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println(numbers.get(0));
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
			System.out.println("-------");
		}
	}

}
