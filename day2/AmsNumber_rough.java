package week.day2;

public class AmsNumber_rough {
	public void rough() {
		int num1 = 371;
		int i = num1;
		int temp = 0;
		int a;
		while(temp>0)
		{
			a =num1%10;
			temp = temp+(a*a*a);
			num1=num1/10;
		}
			if (num1==i)
				System.out.println(num1 +" is a Amstrong Number");			
		}
		
		
	public static void main(String[] arg)
	{
		AmsNumber_rough ams = new AmsNumber_rough();
		ams.rough();
	}
	}
	
