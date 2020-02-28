import java.util.*;
import java.util.ArrayList; 
public class RemoveDuplicates{
	public static void main(String[] args){
		System.out.println();
		System.out.print("Please enter an alphabetical sequence of strings separated\n");
		System.out.print("by spaces. The end of the sequence must be signified using\n");
		System.out.print("the sentinel value lastString, followed by a return.\n\n\n");
		Scanner console = new Scanner(System.in);
		ArrayList<String> arrlist = new ArrayList<>();
		ArrayList<String> arrlist2 = new ArrayList<>();
		Boolean flag = true;
		String string;
		while (flag == true){
			string = console.next();
			if (string.equals("lastString")){
				flag = false;
			}

			else{
				arrlist.add(string);
			}
		}
		System.out.print("Your original list: ");
		System.out.println(arrlist + "\n");
		for(int i = 0; i < arrlist.size(); i++) {
	        for(int j = i + 1; j < arrlist.size(); j++) {
	            if(arrlist.get(i).equalsIgnoreCase(arrlist.get(j))){
	                arrlist.remove(j);
	                j--;
	            }
	        }
	    } 
		System.out.print("Your list with duplicates removed: ");
		System.out.println(arrlist + "\n");
	}
}