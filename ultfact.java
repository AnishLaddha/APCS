import java.util.*;
import java.math.BigInteger;
public class ultfact{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a natural number (non-negative integer): ");
		int usr = console.nextInt();
		
		System.out.println("factorial: " + factorial(usr));
		

	}
	public static String factorial(int n){
		BigInteger val = BigInteger.ONE;
		
		for(int i =1; i <= n; i++){
			val = val.multiply(new BigInteger((i%179424691)+""));
			
		}
		BigInteger m = BigInteger.valueOf(179424691);
		BigInteger v = val.mod(m);
		return v.toString();
	}


}