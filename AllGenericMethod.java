package com.BridgeLabz.Day13PracticeProblem;

public class AllGenericMethod {
	
	private static <E extends Comparable> E testMax(E value1, E value2, E value3) {

		E max = value1; //Assume Value-1 is Initially Largest

		if (value2.compareTo(max) > 0) {
			max = value2; //Value-2 is Largest so far
		}
		if (value3.compareTo(max) > 0) {
			max = value3; //Value-3 is Largest so far
		}
		return max; // Return Largest Element

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Maximum String Program");
		Integer result1 = AllGenericMethod.testMax(30, 20, 10);
		Float result2 = AllGenericMethod.testMax(30.45f, 20.56f, 10.36f);
		String result3 = AllGenericMethod.testMax("Apple", "Peach", "Banana");
		System.out.println("\nMaximum Integer Among Three Integer is : " + result1);
		System.out.println("Maximum Float Among Three Float is : " + result2);
		System.out.println("Maximum String Among Three String is : " + result3);
	}

}
