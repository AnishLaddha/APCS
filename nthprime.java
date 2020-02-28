import java.util.*;
public class nthprime{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		System.out.println(sieve(n));
		
	}
	public static int sieve(int n){
		int num = n*20;
		boolean prime[] = new boolean[num];
		for(int i = 0; i <num; i++){
			prime[i] = true;
		}
		for(int i = 2; i*i <= num -1; i++){
			if(prime[i]==true){
				for(int j = i*i; j <= num-1; j+=i){
					prime[j] = false;
				}
			}
		}
		int count = 0;
		int index = 0;
		while(count != n+2){
			if(prime[index]==true){
				count++;
				
			}
			index++;
		}
		return index-1;
		
		
	}
}