package week.day2;

public class AmsNumber1 {
				public void amStrong() 
				{
			int input = 371;
			int num[]; 
			num =new int[3];
		    num[0] =input%10;
		    num[1] =(input%100)/10;
		    num[2]= input/100;
		    System.out.println(num[0]);
			System.out.println(num[1]);
			System.out.println(num[2]);
		    int fact1 = (num[0]*num[0]*num[0]);
		    int fact2 = (num[1]*num[1]*num[1]);
		    int fact3 = (num[2]*num[2]*num[2]);
		    int check = fact1+fact2+fact3;
		    
		    System.out.println("Cube Sum of the given number " +  check);
		    if (check ==input)
		    {
		    	System.out.println(input + " is Amstrong Number");
		    }
		    else 

			 System.out.println(input + " is not a Amstrong Number");
			}	
			
		
public static void main(String[] args) {
	AmsNumber1 a = new AmsNumber1();
	a.amStrong();
}}

	
