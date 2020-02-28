import java.util.*;
public class revarray3{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
	    ArrayList<Integer> list = new ArrayList<>();
	    System.out.println();
	    System.out.println("Please enter a sequence of integers separated");
	    System.out.println("by spaces. End the sequence with the sentinel");
	    System.out.println("value 0, followed by a return.");
	    System.out.println();
	    String s;


	    while(console.hasNext()){
	      s = console.next();
	      if(s.equals("0")){

	        break;
	      }
	      list.add(Integer.parseInt(s.toLowerCase()));
	    }
		System.out.print("Your original list: ");
		System.out.println(list);
		System.out.println();

		int size = list.size();
		int threes = size/3;
		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i = 0; i<size-2; i += 3){
			int one = list.get(i);
			int two = list.get(i+1);
			int three = list.get(i+2);
			list2.add(i,three);
			list2.add(i+1,two);
			list2.add(i+2, one);
		}
		if ((threes*3) != size){
			for(int i = threes*3; i<size;i++){
				int oof = list.get(i);
				list2.add(i, oof);
			}
		}
		System.out.print("Your reversed3 list: ");
		System.out.println(list2);

	}
}
