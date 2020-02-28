import java.util.*;
import java.io.*;
public class clump{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		System.out.println();
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value \"stop\", followed by a return.");
		System.out.println();

		String input = s.next();
		while (!input.equals("stop")){
			list.add(input);
			input = s.next();
		}

		System.out.println("Your original list: "+Arrays.toString(list.toArray()));
		System.out.println();
		if (list.size()%2==0){
			for (int i=0; i<list.size()-1;i+=2){
				list2.add("("+list.get(i)+" "+list.get(i+1)+")");
			}
		}
		else{
			for (int i=0; i<list.size()-2;i+=2){
				list2.add("("+list.get(i)+" "+list.get(i+1)+")");
			}
			list2.add(list.get(list.size()-1));
		}

		System.out.println("Your clumped list: "+Arrays.toString(list2.toArray()));
	}
}