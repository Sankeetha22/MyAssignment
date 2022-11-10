package week.day2;

public class Findintersec {
	public void rough() {
		int num1[] = {4,0,8,9,3};
		int num2[] = {7,5,2,1,4};
		for (int i = 0; i < num1.length; i++) 
		{
			for (int j = 0; j < num2.length; j++)
				if(num1[i]==num2[j])
				{
				System.out.println("Intersection found for the number "+ num1[i]);
				}
		}
		}
		
		
	public static void main(String[] arg)
	{
		Findintersec ams = new Findintersec();
		ams.rough();
	}
	}
	
