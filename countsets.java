import java.util.*;
public class countsets{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int terms = console.nextInt();
		int[] values = new int[terms];
		int num = 1;
		int count = 0;
		for(int i = 0; i < terms; i++){
			int a = console.nextInt();
			values[i] = a;
		}
		int n = 100000000;
		for(int i = 0; i < terms-1; i++){
			if(values[i] == values[i+1] && values[i+1] != n){
				n = values[i];
				count++;
			}

		}
		System.out.println(count);
	}
}