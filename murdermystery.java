//10 52 14 28 4 15 14 47 56 9 8 26 27 26 6 70 44 4 6 35 5 23 19 17 37 7 14 29 40 22 12 50 22 32 38 68 3 1 10 42 14 2 16 9 11 8 1 81 29 38 24 67 4 14 1 50 16 13 41 8 11 1 7 43 11 43 20 41 21 39 14 23 8 3 2 44 16 12 37 11 9 24 25 56 42 20 30 25 20 24 9 36 52 38 3 29 7 24 25 29 14 40 23 41 51 9 4 25 6 28 17 13 51 7 3 36 4 17 14 87 2 7 11 85 35 9 7 48 10 19 8 64 48 14 28 22 31 2 29 22 48 30 15 29 24 9 31 72 32 1 4 43 13 11 1 21




import java.util.*;
public class murdermystery{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int term = console.nextInt();
		int[] nums = new int[term];
		for(int i = 0; i < term; i++){
			nums[i] = console.nextInt();
		}
		int mod = term%8;

		int[] num2 = new int[term-mod];
		int e = term -mod;
		//System.out.println(term+" "+mod);


		
		System.arraycopy(nums, 0, num2, 0, e);
		for(int i = 0; i < e; i+=8){
			int a = num2[i+1];
			int b = num2[i+2];
			num2[i+1] = num2[i+5];
			num2[i+2] = num2[i+6];
			num2[i+5] = a;
			num2[i+6] = b;
		}
		for(int i = 0; i<e; i +=4){
			int sum = num2[i] + num2[i+1] + num2[i+2] + num2[i+3];
			char let = (char) sum;
			System.out.print(let);
		}
		int sum2 = 0;
		if(mod !=0){
			for(int i =0; i <4; i++){
				sum2 += nums[e+i];
			}
			char f = (char) sum2;
			System.out.print(f);
		}
		System.out.println("");
		// for(int i = 0; i < 152; i++){
		// 	System.out.println(num2[i]);
		// }

	}
}