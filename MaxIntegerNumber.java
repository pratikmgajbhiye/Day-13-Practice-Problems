package com.BridgeLabz.Day13PracticeProblem;

public class MaxIntegerNumber {
	
	public static Integer testMax(Integer value1, Integer value2, Integer value3) {
		Integer max = value1;  //Set the first value as max

		if (value2.compareTo(max) > 0) { //Compare between first and second value
			max = value2;
		}
		if (value3.compareTo(max) > 0) { //Compare with third value
			max = value3;
		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Maximum Integer Number is " + testMax(30, 20, 10));
	}

}
