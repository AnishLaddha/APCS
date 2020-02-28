import java.util.*;
//15485863
public class nprime{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("enter integer n for nth prime (1st prime = 2): ");
		int usr = console.nextInt();
		long start = System.currentTimeMillis();
		int ans = nthprime(usr-1);
		long end = System.currentTimeMillis();

		double time = (double)end - (double) start;
		System.out.println("Prime #"+usr+" is "+ans);
		System.out.println(time);
		
	}
	public static int nthprime(int n){
		if(n+1 ==1 || n+1==2){
			return n+2;
		}
		if(n == 3){
			return 5;
		}
		int count = 1;
		int init = 13;
		while(count < n-4){
			if(checkprime(init) == true){
				count++;
			}
			init+=2;
		}
		
		return init-2;

	}
	// public static boolean checkprime(long num){
	// 	if (num<2){
	// 		return false;
	// 	}
	// 	if ( num == 2 || num ==3){
	// 		return false;
	// 	}
	// 	if (num%2 == 0 || num%3 == 0){
	// 		return false;
	// 	}
	// 	long sqrt = (long)Math.sqrt(num) + 1;
	// 	for(long i = 6L; i <= sqrt; i+= 6){
	// 		if(num%(i-1) == 0 || num%(i+1) == 0){
	// 			return false;
	// 		}
	// 	}
	// 	return true;
	// }
	public static boolean checkprime(long num){
		
		if (num%2 == 0 || num%3 == 0|| num%5 == 0 || num%7 == 0|| num%11 == 0 || num%13 ==0){
			return false;
		}
		long sqrt = (long)Math.sqrt(num)+1;
		for(long i = 6L; i <= sqrt; i+= 6){
			if(num%(i-1) == 0 || num%(i+1) == 0){
				return false;
			}
		}
		return true;
	}
}