package com.rakesh.java.java8;

public class TestJava8 {
	
	public static void main(String[] args) {
		TestJava8 test= new TestJava8();
		MathOperation addition = (a,b) -> a+b;
		MathOperation multiplication = (a,b) -> a*b;
		
		System.out.println(test.operate(5, 3, addition));
		System.out.println(test.operate(5, 3, multiplication));
	}
	
	interface MathOperation {
      int operation(int a, int b);
   }
	
   //this is a method using interface MathOperation
   private int operate(int a, int b, MathOperation mathOperation){
      return mathOperation.operation(a, b);
   }

}
