package com.BridgeLabz.Day13PracticeProblem;

public class GenericClass<E extends Comparable<E>> {
	
	private E value1, value2, value3;

	public GenericClass(E value1, E value2, E value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}

	public E testMax() {
		return GenericClass.testMax(value1, value2, value3);
	}

	//Determine largest three comparable objects
	public static <E extends Comparable<E>> E testMax(E value1, E value2, E value3) {

		E max = value1; //Assume value1 is initially largest

		if (value2.compareTo(max) > 0) {
			max = value2; //Value2 is largest so far
		}
		if (value3.compareTo(max) > 0) {
			max = value3; //Value3 is largest so far
		}

		return max; //Return largest element

	}

	public static void main(String[] args) {
		System.out.println("Welcome to maximum string program !");
		GenericClass<Integer> maximumNumber = new GenericClass<>(30, 20, 10);
		GenericClass<Float> maximumNumber1 = new GenericClass<>(30.45f, 20.56f, 10.36f);
		GenericClass<String> maximumNumber2 = new GenericClass<>("Apple", "Peach", "Banana");
		System.out.println("\nMaximum integer among three integer : " + maximumNumber.testMax());
		System.out.println("Maximum float among three float : " + maximumNumber1.testMax());
		System.out.println("Maximum string among three float : " + maximumNumber2.testMax());

	}

}
