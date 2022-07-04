package com.app;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(checkIFInputIsAnEvenNumber(122));
		//Testing in the main method
	}
	
	public static boolean checkIFInputIsAnEvenNumber(int number)
	{
		return number%2==0;
	}
	
}
