import java.util.*;

public class prime2{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int less;
		int greater;
		boolean ok = false;
		if(checkprime(n) == true){
			less = n;
			greater = n;
		}
		else{
			int i = 1;

			while(ok = false){
				if(checkprime((long)(n-i)) == true){
					ok = true;
				}
				else{
					i--;
				}
			}
			less = n-i;
			ok = false;
			i = 1;
			while(ok == false){
				if(checkprime((long)(n+i)) == true){
					ok = true;
				}
				else{
					i++;
				}
			}
			greater = n+i;

		}
		System.out.println(less);
		System.out.println(greater);





		
	}
	public static boolean checkprime(long num){
		if(num == 2 || num == 3){
			return true;
		}
		if (num%2 == 0 || num%3 == 0){
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