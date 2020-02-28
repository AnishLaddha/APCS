import java.util.*;



public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
    	System.out.print("Enter number of terms: ");
		int terms = console.nextInt(); 
		long number1 = 0;
		long number2 = 1;
		long number3;
		System.out.println(number1);
		System.out.println(number1 + number2);

		for(int i = 3; i <= terms; i++)
		{
			number3 = number1 +number2;
			System.out.println(number3);
			number1 = number2;
			number2 = number3;


		}

	}
}