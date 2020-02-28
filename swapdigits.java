import java.util.*;
public class swapdigits{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter your number: ");
		int usr = console.nextInt();
		int len = (int)(Math.log10(usr) + 1);
		int start = len %2;
		int[] digits = new int[len];
		int j = 0;
		while(usr != 0){
			digits[j] = usr % 10;
			usr /= 10;
			j++;
		}
		int t;
		for (int i = 0; i < len / 2; i++) { 
            t = digits[i]; 
            digits[i] = digits[len - i - 1]; 
            digits[len - i - 1] = t; 
        } 
  //       for(int n = 0; n < len; n++){
		// 	System.out.println(digits[n]);
		// }
		int k;
		for(int i = start; i < len; i +=2){
			k = digits[i];
			digits[i] = digits[i+1];
			digits[i +1] = k;

		}
		System.out.print("swapped result = ");
		for(int n = 0; n < len; n++){
			System.out.print(digits[n]);
		}
		System.out.println("");
	}

}