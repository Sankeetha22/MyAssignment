package week.day2;

public class Fibonaci {
	
	
	public void calc() {
		int num1 =0;
		int num2 =1;
		//System.out.println(len);
		int input = 15;
		int count = 0;
		
		for(int i=1;i<=input;i++)
		{
				count = num1+num2;
                num1=num2;
                num2=count;
                System.out.println(count);
                
				}
	}

	
	
	public static void main(String[] args) {
		Fibonaci Fib = new Fibonaci();
		Fib.calc();
		
	}
}
