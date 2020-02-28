import java.io.*;
import java.util.*;
public class wordcount{
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter name of text file, e.g. Iliad.txt: ");
		String s = console.nextLine();
		Scanner input = new Scanner(new File(s));
		int wordCount = 0;
		while(input.hasNext()){
			String word = input.next();

			wordCount++;
		}
		System.out.println("Total words = "+wordCount);


	}
}