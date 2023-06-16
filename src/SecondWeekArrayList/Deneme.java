package SecondWeekArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deneme {

	public static void main(String[] args) {
		/*Car car1=new Car("Ford");
		Car car2=new Car("GM");
		Car car3=new Car("Toyota");*/
		ArrayList<Car>carList=new ArrayList<>();
		carList.add(new Car("Ford"));
		carList.add(new Car("GM"));
		carList.add(new Car("Toyota"));
		System.out.println(carList);
		Stack<Integer>numbers=new Stack<>();
		numbers.push(10);
		numbers.push(20);
		numbers.push(10);
		numbers.push(30);
		numbers.search(20);
		Collections.sort(numbers);
       System.out.println(numbers);
       for(int i=0;i<numbers.size();i++) {
    	   System.out.println(numbers.get(i));
       }
       System.out.println("*********");
		
		
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(1);
		nums.add(4);
		int n=nums.indexOf(3);
		nums.remove(n);
		Collections.sort(nums);
		System.out.println(nums);
		System.out.println(nums.get(0));
		for(Integer i:nums) {
			System.out.println(i);
			System.out.println("-----");
			
		}
		}
		
		
		

	}


