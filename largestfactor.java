import java.util.*;
public class largestfactor{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int fact = 1;
		int count = 1;

		while(count < (n/2)+1){
			if(n % count == 0){
				fact = count;
			}
			count = count + 1;
			
		}
		System.out.println(fact);
	}
}