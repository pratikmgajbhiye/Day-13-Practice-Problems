package com.BridgeLabz.Day13PracticeProblem;

public class MaxFloatNumber {
	
	public static Float testMax(Float value1, Float value2, Float value3) {
		Float max = value1; //Set the first float value as max

		if (value2.compareTo(max) > 0) { //Compare between first and second float value
			max = value2;
		}
		if (value3.compareTo(max) > 0) { //Compare with third float value
			max = value3;
		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Maximum Float is " + testMax(30.45f, 20.56f, 10.36f));
	}

}
