package com.rakesh.java.logical;

import java.util.Random;

public class RandomValues {

	public static void main(String[] args) {
		
		String [] resolution={"RETURN_TO_VENDOR","DONATE","SALVAGE","DESTROY"};
		
		Random randomGenerator = new Random();
	    for (int i = 0; i <=6; i++){
	      int randomInt = randomGenerator.nextInt(4);
	      System.out.println(resolution[randomInt]);
	    }
	   
	    
	    


	}

}
