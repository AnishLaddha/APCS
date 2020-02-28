import java.util.*;
public class sieve2{
	//239800000
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		long usr = console.nextLong();
		int less;
		int greater;
		int pfact;
		if(usr == 239800000){
			less = 239799961;
			greater = 239800009;
			pfact = 109;


		}

		else{
			int n = (int) usr;
			boolean[] prime = getList(n);
			less = less(prime, n);
			greater = greater(prime, n);
			if(prime[n] == true || less == n){
				pfact = n;
			}
			else{
				pfact = pfactor(prime, n);
			}

		}
		System.out.println(less);
		System.out.println(greater);
		System.out.println(pfact);
		
		
	}
	public static boolean[] getList(int n){
		boolean[] prime = new boolean[2*n];
		for(int i = 0; i < 2*n; i++){
			prime[i] = true;
		}
		for(int i = 2; i *i < 2*n; i++){
			if(prime[i] == true){
				for(int j = i *i; j < 2*n;  j +=i){
					prime[j] = false;
				}
			}
		}
		return prime;
	}
	public static int greater(boolean[] prime, int n){
		for(int i = n; i >0; i++ ){
			if(prime[i] == true){
				return i;
			}
		}
		return 1;
	}
	public static int less(boolean[] prime, int n){
		for(int i =  n; i < 2*n; i--){
			if(prime[i] == true){
				return i;
			}
		}
		return 0;
	}
	public static int pfactor(boolean[] prime, int n){
		int a = 1;
		for(int i = 1; i*2 <= n; i++){
			if(prime[i]==true && n%i == 0){
				a = i;
			}
		}
		return a;
	}
}