import java.util.*;

public class collatz{
	
	public static void main(String[] args) {
		int big = -5;
		Scanner console = new Scanner(System.in);

		System.out.print("Enter number of terms followed by terms: ");
		int terms = console.nextInt();

		
		for(int i = 0; i <terms; i++){
			int n = console.nextInt();
			int count = 0;
			while(n != 1){
				if (n%2 == 1){
					n = (3*n)+1;
				}
				else{
					n = n/2;

					
				}
				count++;
			}
			count = count+1;
			if(count>big){
				big = count;
			}
			System.out.println(count);
		}
		System.out.println("Longest: "+ big);
		


	}
}