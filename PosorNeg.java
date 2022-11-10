package week.day2;

public class PosorNeg {
public void calc() {
		int []input = {1,2,-3,4,6,7,-9};

		for(int i=0;i<input.length;i++)
		{
			if (input[i] <0)
				System.out.println(input[i]+" is negative");
			else
				System.out.println(input[i]+" is positive");
		}
		}

	public static void main(String[] args) {
		PosorNeg Fib = new PosorNeg();
		Fib.calc();
		
	}
}
