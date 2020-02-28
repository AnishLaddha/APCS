import java.util.*;
public class intleave{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		ArrayList<Integer> list1= new ArrayList<>();
		System.out.println();
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println();

		boolean flag = false;
		int inp;
		while(flag == false){
			inp = console.nextInt();
			if(inp == 0){
				flag = true;

			}
			else{
				list1.add(inp);
			}
		}
		System.out.print("Your first list: ");
		System.out.println(list1);
		System.out.println();


		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println();

		ArrayList<Integer> list2= new ArrayList<>();
		boolean flag2 = false;
		int inp2;
		while(flag2 == false){
			inp2 = console.nextInt();
			if(inp2 == 0){
				flag2 = true;

			}
			else{
				list2.add(inp2);
			}
		}
		System.out.print("Your second list: ");
		System.out.println(list2);
		System.out.println();
		//System.out.println(list2.get(0));

		ArrayList<Integer> fin = interleave(list1,list2);
		System.out.print("Your interleaved list: ");
		System.out.println(fin);


	}
	public static ArrayList<Integer> interleave(ArrayList<Integer> l1, ArrayList<Integer> l2){
		ArrayList<Integer> hold1 = new ArrayList<>();
		ArrayList<Integer> hold2 = new ArrayList<>();



		if(l1.size() > l2.size()){
			for(int i = l2.size(); i < l1.size(); i++){
				hold1.add(l1.get(i));
			}

			for(int i = 0; i < l2.size(); i++){
				hold2.add(l1.get(i));
				hold2.add(l2.get(i));
			}
		}
		else{
			for(int i = l1.size(); i < l2.size(); i++){
				hold1.add(l2.get(i));
			}
			for(int i = 0; i < l1.size(); i++){
				hold2.add(l1.get(i));
				hold2.add(l2.get(i));
			}

		}
		
		hold2.addAll(hold1);
		return hold2;

	}
}