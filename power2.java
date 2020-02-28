import java.util.*;
public class power2{
	public static void main(String[] args) {
		powerof2(3);
		powerof2(10);
	}
	public static void powerof2(int n){
		for(int j = 0; j <= n; j++){
			int pow = 1;

			for(int e = 1; e <= j; e++){
				pow = pow *2;
			}
			System.out.print(pow + " ");
		}
		System.out.println("");
	}
}