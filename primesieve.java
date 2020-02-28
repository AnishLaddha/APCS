import java.util.*;
public class primesieve{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int ans[] = sieve(n);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		System.out.println(ans[2]);
		
	}
	public static int[] sieve(int n){
		int less = 0;
		int great = 0;
		int lp =1;
		boolean prime[] = new boolean[100*n];
		
		for(int i = 0; i < n*100; i++){
			prime[i] = true;
		}
		for(int i = 2; i * i <= n*100-1; i++){
			if(prime[i] == true){
				for(int j = i * i; j <= n*100-1; j += i){
					prime[j] = false;
				}
			}
		}
		for(int a = n; a > 0; a--){
			if (prime[a] == true){
				less = (a);
				a = 0;
			}
		}
		for(int b = n; b <= n*50-1; b++){
			//System.out.println(b + " "+ prime[b]);
			if(prime[b] == true){
				great = b;
				b = n*100;
			}

		}
		if(less == n){
			lp = n;
		}
		else{
			for(int i = 1; i*i <= n; i++){
				if(prime[i] == true){
					if(n%i == 0){
						lp = i;
					}
				}
			}	

		}
		
		int[] gl = new int[]{less, great, lp};
		return gl;
		
	}
}
