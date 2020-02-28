import java.util.*;


public class kDigit{
//	public static final int x = 46573;
//	public static final int y = 2;

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    	int x = myObj.nextInt();
    	int y = myObj.nextInt();

		System.out.println(getDigit(x,y));
		
	}
	public static int getDigit(int n, int k){
		int a = n%((int)(Math.pow(10, k+1)));
		System.out.println(a);
		int z = a/((int)(Math.pow(10,k)));
		return z;
	}
	


}