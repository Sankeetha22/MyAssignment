package week.day2;

import java.util.Arrays;

public class SecondLargeNo {
public void calc() {
		int []input = {1,2,-3,4,6,7,-9};
		
//Sort method	
	Arrays.sort(input);
	int count = input.length;
   System.out.println("Count of the Numbers in the given Array "+count);
   System.out.println("Second largest Number in the Array "+input[count-2]);
}


	public static void main(String[] args) {
		SecondLargeNo Arr = new SecondLargeNo();
		Arr.calc();
		
	}
}
