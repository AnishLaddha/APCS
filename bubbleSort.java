import java.util.*;
public class bubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
         for(int i=0; i < n-1; i++){
            for(int j=1; j < (n-i); j++){
            	if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
			System.out.println(Arrays.toString(arr));
         }

    }
    public static void main(String[] args) {
		System.out.println("bubbleSort");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Scanner console = new Scanner(s);
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(console.hasNext()){
			array.add(console.nextInt());
		}
		System.out.println(array);
		int[] arr = array.stream().mapToInt(Integer::intValue).toArray();
        sort(arr);
		System.out.println();


    }
}
