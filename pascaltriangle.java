import java.util.*;
import java.math.BigInteger;
public class pascaltriangle{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input row index: ");
		int a = console.nextInt();
		System.out.print("Input column index: ");
		int b = console.nextInt();

		long rows = (long) a+b;
		int e = (int) rows;
		
		//System.out.print(1+" ");
		//System.out.println("");
		long[][] arrpascal = new long[92][92];

		for (long n = 1; n <= rows; n++){
			long space = (rows-n)*2;

			long val = 1;
			arrpascal[(int)n-1][0] = 1; 
			for(long r = 1; r <= n; r++){
				val = val * (n-r+1)/r;
				arrpascal[(int)n-1][(int)r] = val;

			}
			arrpascal[(int)n][(int)n+1] = 1;
		}
		// for(int n = 0; n <rows;n++){
		// 	for(int r = 0; r <=n+1;r++ ){
		// 		System.out.print(arrpascal[n][r] + " ");

		// 	}
		// 	System.out.println("");
		// }

		//System.out.println(arrpascal[6-1][3]);
		a = a+b;
		b = 0;
		long sum = 0;
		while(a >= b){
			sum += arrpascal[a-1][b];
			System.out.printf("%-17s","arrPascal[" +a+"]["+b+"]");
			System.out.print(" ="+ " " + arrpascal[a-1][b]);
			System.out.println();
			a--;
			b++;
		}
		System.out.println("-----------------------");
		int fib = (int)rows+1;
		
		System.out.println("Fibonacci("+fib+")     = "+sum);
		// System.out.print("["+arrpascal[(int)rows-1][0] + ",");
		// for(int i = 1; i<rows;i++){
		// 	System.out.print(" "+arrpascal[(int)rows-1][i] + ",");
		// }
		// System.out.print(" "+arrpascal[(int)rows-1][(int)rows] + "]");
		BigInteger n = BigInteger.valueOf(rows);
		System.out.print(1+" ");

		BigInteger hold;
		BigInteger hold2;
		BigInteger hold3;
		String fin;

		BigInteger value = BigInteger.ONE;
		
		for(BigInteger r = BigInteger.ONE; r.compareTo(n) <= 0; r.add(BigInteger.ONE)){
			hold = n.add(r.negate());
			hold2 = hold.add(BigInteger.ONE);
			hold3 = value.multiply(hold2);
			value = hold3.divide(r);
			fin = value.toString();
			System.out.print(fin + " ");
		}

	}
}
