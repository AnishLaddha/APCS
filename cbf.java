import java.util.*;
public class cbf {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int usr = console.nextInt();

		int[] total = new int[usr];

		for(int i = 0; i < usr; i++){
			int val = check(i);
			total[i] = val;
		}
		int answer = 0;
		for(int j = 0; j < usr; j++){
			answer = answer + total[j];
		}
		System.out.println(answer);
		
	}
	public static int check(int num){
		if (num % 3 == 0){
			if (num % 5 == 0){
				return 0;
			}
			else{
				return num;
			}
		}
		else if (num % 5 == 0){
			if (num % 3 == 3){
				return 0;
			}
			else{
				return num;
			}
		}
		else{
			return 0;
		}
	}
}