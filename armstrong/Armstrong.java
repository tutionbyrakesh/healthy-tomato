package com.rakesh.test.java;

public class Armstrong {

	public static void main(String[] args) {
		int x=548834;
		System.out.println("going to read from last value of:"+x);
		
		int digits=getDigit(x);
		long sum = getSumOfAllPositions(x,digits);
		
		//checking armstrong
		System.out.println("\n\n\n");
		System.out.println("number is "+x + " and final sum is "+sum);
		if(x==sum){
			System.out.println("number "+x+ " is armstrong");
		}else{
			System.out.println("number "+x+ " is not an ArmStrong");
		}
	}
	
	public static long getSumOfAllPositions(int x,int digits){
		//will sum all the valuse eg. for 123 ==> 1*1*1 + 2*2*2 + 3*3*3 = 36
		long sum=0;
		while(x!=0){
			int position = x%10;
			System.out.println("\nGetting Position "+position);
			sum= sum+selfMultiplication(position, digits);
			x=x/10;
		}
		return sum;
	}
		
	public static int getDigit(int x){
		// will count number of digit in number
		int digit=0;
		while(x!=0){
			x=x/10;
			++digit;
		}
		System.out.println("#of digit: "+digit);
		return digit;
	}
	
	public static long  selfMultiplication(int x,int numberOfDigit){
		//this is actually 5 pow 3 = 5X5X5
		long result=1;
		for(int i=0;i<numberOfDigit;i++){
			result = result*x;
			System.out.print(x+" X ");
		}
		return result;
	}
	

}
