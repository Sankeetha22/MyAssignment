package week1.day1;

public class Test1{
	 
	static String mobileBrandName = "One Plus";
	static char mobileLogo = 'O';
	static short noOfMobilePiece;
	static int modelNumber;
	static long mobileImeiNumber;
	static float mobilePrice;
	boolean isDamaged  =true;

	
		
	public void details() {
		// TODO Auto-generated method stub
    
		System.out.println("Mobile Details");
	}
	
	public static void main(String[] args) {
		Test1 Item1 = new Test1();
		Item1.details();
		System.out.println("Brand name :"+ mobileBrandName);
		System.out.println("Logo : " + mobileLogo );
		System.out.println("No Of Piece: " + noOfMobilePiece);
		System.out.println("Model Number : " + modelNumber);
		System.out.println("IMEI Number :"+ mobileImeiNumber);
		System.out.println("Mobile Price :"+ mobilePrice);
		System.out.println("Damaged ? :"+ true);
		
		}

	
}

