import java.util.*;
public class insertSort{
	public static void main(String[] args) {
		System.out.println("insertionSort");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Scanner console = new Scanner(s);
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(console.hasNext()){
			array.add(console.nextInt());
		}
		System.out.println(array);
		int[] arr = array.stream().mapToInt(Integer::intValue).toArray();

		sorter(arr);
		System.out.println();
	}
	public static void sorter(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }

            array[i+1] = key;
			System.out.println(Arrays.toString(array));
        }
    }
}
