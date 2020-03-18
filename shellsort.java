import java.util.*;
public class shellsort{
	public static void main(String[] args) {
		System.out.println("shellSort");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Scanner console = new Scanner(s);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(console.hasNext()){
			arr.add(console.nextInt());
		}
		System.out.println(arr);
		int[] array = arr.stream().mapToInt(Integer::intValue).toArray();
		sort(array);
		System.out.println(Arrays.toString(array));


	}
	public static void sort(int arrayToSort[]) {
    int n = arrayToSort.length;

    for (int gap = n / 2; gap > 0; gap /= 2) {
        for (int i = gap; i < n; i++) {
            int key = arrayToSort[i];
            int j = i;
            while (j >= gap && arrayToSort[j - gap] > key) {
                arrayToSort[j] = arrayToSort[j - gap];
                j -= gap;
            }
            arrayToSort[j] = key;
        }
    }
}
}
