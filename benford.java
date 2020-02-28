import java.io.*;
import java.util.*;
public class benford{
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Let us count those leading digits...");

		Scanner console = new Scanner(System.in);
		System.out.print("input file name? ");
		String s = console.next();
		//get file name
		Scanner input = new Scanner(new File(s));
		//get file 
		int[] array = new int[10];
		//used to store count of how many have each first digit
		for(int i = 0; i <10;i++){
			array[i] = 0;
		}
		//assign them 0 originally

		String word;
		int len;
		int val;
		int first;
		int div;
		int count=0;
		//declare some variables
		while(input.hasNextLine()){
			word = input.nextLine();
			//get string input
			len = word.length();
			//length
			val = Integer.parseInt(word);
			//convert to int
			div = (int) Math.pow(10,len-1);
			//this is what it will be divided by to get first digit
			first =  val/div;
			//first digit
						
			array[first] +=1;
			//increase count of that digit by 1

			count++;
			//increase count of numbers by one

		}
		count = count-array[0];
		//remove zeroes from equation
		if(array[0] != 0){
			System.out.println("excluding "+array[0]+" zeros");
			//print this
		}
		float percent;
		//declare the percents
		System.out.println("Digit Count Percent");
		for(int i =1; i<10;i++){
			//for all first digits
			System.out.printf("%5d", i);
			//print digit
			System.out.print(" ");
			System.out.printf("%5d", array[i]);
			//print the count
			System.out.print(" ");
			percent = 100*((float)array[i])/((float) count);
			//calc percent
			System.out.printf("%6.2f", (double)Math.round(percent * 100d) / 100d);
			//round percent and print
			System.out.println("");

		}
		System.out.print("Total");
		System.out.print(" ");
		System.out.printf("%5d", count);
		//print total count
		System.out.print(" ");
		System.out.println("100.00");

		// for(int i = 0; i <10;i++){
		// 	System.out.println(array[i]);
		// }

		
		
		
		
	}
}