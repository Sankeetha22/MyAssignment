package week.day2;

public class ConverttoPos {
public void calc() {
		int []input = {1,2,-3,4,6,7,-9};

		for(int i=0;i<input.length;i++)
		{
			if (input[i] <0)
			    System.out.println("The Given number "+input[i]*-1 +" is coverted to positive");
			
		}
		}

	public static void main(String[] args) {
		ConverttoPos Fib = new ConverttoPos();
		Fib.calc();
		
	}
}
