import java.util.*;


public class power{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Base: ");
		int a = console.nextInt();
		System.out.println("Exponent: ");
		int b = console.nextInt();
		System.out.println(exponent(a,b));

	}
	public static int mult(int first, int second){
		int hold = 1;
			for(int n =1; n <= second; n++){
			for(int m = 1; m <= first; m++){
				hold = hold +1;
			}


		}
		hold = hold-1;
		
		
		
		

		return hold;
	}



	public static int exponent(int base, int exponent){
		int b1 =1;
		for(int i = 1; i <= exponent; i++){
			b1 = mult(b1, base);
		}
		return(b1);
	}

}