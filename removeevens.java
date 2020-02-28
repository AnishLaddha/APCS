import java.util.*;
import java.io.*;
import java.lang.Math;
public class removeevens{
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Removes Strings of even length from an array");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter filename for file containing Strings: ");
		String s = scan.next();
		Scanner console = new Scanner(new File(s));
		ArrayList<String> input = new ArrayList<>();
		while(console.hasNext()){
			String hold = console.next();
			input.add(hold);
		}
		System.out.println("initial list.size(): "+ input.size());
		ArrayList<String> output = new ArrayList<>();
		String word;
		for(int i = 0; i < input.size(); i++){
			word = input.get(i);
			//System.out.println(word);
			if(word.length()%2 == 1){
				output.add(word);
			}
		}
		System.out.println("final   list.size(): "+output.size());
	}
}
