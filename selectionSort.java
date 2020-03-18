/*
Implement selectionSort.

The user will supply 10 space-separated integers from the console.
HyperGrade examples are formatted using Arrays.toString(), but you
are free to format "by hand." Print each iteration of each sort as
in the HyperGrade example shown below. With 10 elements in
your input array, you should print 10 lines of output, including the
original array.

Example:

input
27 301 5 -18 27 75 157 -82 0 10

output:
selectionSort

[27, 301, 5, -18, 27, 75, 157, -82, 0, 10]

[-82, 301, 5, -18, 27, 75, 157, 27, 0, 10]

[-82, -18, 5, 301, 27, 75, 157, 27, 0, 10]

[-82, -18, 0, 301, 27, 75, 157, 27, 5, 10]

[-82, -18, 0, 5, 27, 75, 157, 27, 301, 10]

[-82, -18, 0, 5, 10, 75, 157, 27, 301, 27]

[-82, -18, 0, 5, 10, 27, 157, 75, 301, 27]

[-82, -18, 0, 5, 10, 27, 27, 75, 301, 157]

[-82, -18, 0, 5, 10, 27, 27, 75, 301, 157]

[-82, -18, 0, 5, 10, 27, 27, 75, 157, 301]

*/
import java.util.*;
public class selectionSort{
	public static void main(String[] args) {
		System.out.println("selectionSort");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Scanner console = new Scanner(s);
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(console.hasNext()){
			array.add(console.nextInt());
		}
		System.out.println(array);
		//sorter(array,0);
		sorter2(array);
		System.out.println();
	}
	public static void sorter2(ArrayList<Integer> arr){
		for(int i = 0; i<arr.size()-1; i++) {
    		int low = arr.get(i);
			int lowindex = i;
    		for(int j = i+1; j<arr.size();j++) {
        		if(low > arr.get(j)) {
					low = arr.get(j);
					lowindex = j;
				}
     		}
		int temp = 	arr.get(i);
		arr.set(lowindex, temp);
		arr.set(i, low);
		System.out.println(arr);
		}
	}
	public static void sorter(ArrayList<Integer> arr, int index){
		if (index == arr.size()-1){
			//System.out.println(arr);
		}
		else{
			int lowind = 0;
			int lowval = 100000000;
			for(int i = index; i < arr.size(); i++){
				if(arr.get(i) < lowval){
					lowind = i;
					lowval = arr.get(i);
				}
			}
			int holder = arr.get(index);
			arr.set(index, lowval);
			arr.set(lowind, holder);
			System.out.println(arr);
			sorter(arr, index+1);
		}
	}
}
