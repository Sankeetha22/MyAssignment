package week.day2;
import java.util.Arrays;

public class MissingElement {
	public void a() 
	{
		int num1[] = {1,2,3,4,5,7};
		//Arrays.sort(num1);
		
		for (int i = 0	; i <num1.length; i++) 
		
		

			if(num1[i] != i+1) 
				
				System.out.println("Missing Number is "+ (i+1));

		}
		
		
		
	public static void main(String[] arg)
	{
		MissingElement ams = new MissingElement();
		ams.a();
	}


					
				

	}


