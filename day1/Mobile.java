package week1.day1;

public class Mobile {
	
	static int noOfWheels =2;
	static short noOfMirrors =2;
	static long chassisNumber = 11334;   
	static Boolean isPunctured = true;
	String bikeName = "Pulsar";
	static double runningKM = 120;

	public void details() {
		// TODO Auto-generated method stub
    
		System.out.println("Bike Details");
	}
	
	public static void main(String[] args) {
		Mobile Item1 = new Mobile();
		Item1.details();
		System.out.println("Wheels :"+ noOfWheels);
		System.out.println("Mirrors: " + noOfMirrors );
		System.out.println("Number: " + chassisNumber);
		System.out.println("IS Punchered ?: " +isPunctured);
		System.out.println("KM ran:"+ runningKM);
		
	}

	
}

