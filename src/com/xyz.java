package com;

public class xyz{
 enum enumTest {
	
	MANGO,
	APPLE,
	BANANA;
	
	public double calculate(double a, double b)
	{
		
	switch (this) {
	case APPLE:
		return a+b;
	case MANGO:
		return a-b;
	default:
		return 0.00;
	}
	
	}
}
 
 public static void main(String[] args)
 {
	System.out.println(enumTest.APPLE.calculate(0.0, 0.32));
 }
 
}
