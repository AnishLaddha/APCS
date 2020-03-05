import java.util.*;
public class mice{
	public static int count = 0;
	public static class pair implements Comparable<pair>{
		int first, second;
		public pair(int first1, int second1) {
			this.first = first1;
			this.second = second1;
		}
		public int compareTo(pair other){
			if(this.first == other.first && this.second == other.second){
				return 0;
			}
			else{
				return -1;
			}
		}


	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int arrsize = console.nextInt();
		int[] myarray = new int[arrsize];
		for(int i = 0; i <arrsize; i++){
			myarray[i] = console.nextInt();
		}
		pair[] mypairs = permute(myarray);

		int nummice = console.nextInt();

		for(int i = 0; i < nummice; i++){
			int masize = console.nextInt();
			int[] mousearray = new int[masize];
			for(int j = 0; j<masize;j++){
				mousearray[j] = console.nextInt();
			}
			if(mousearray.length >1){
				pair[] mousepairs = permutemouse(mousearray);
				if(checkPair(mypairs, mousepairs) == true){

					count++;
				}
				else{
					break;
				}
			}
			else{
				int hold = mousearray[0];
				for(int aa = 0; aa < arrsize; aa++){
					if (myarray[aa] == hold){
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
	// public static pair[] permute (int[] give){
	// 	ArrayList<pair> pairs = new ArrayList<pair>();
	// 	for(int i = 0; i<give.length; i++){
	// 		give[0]
	// 	}
	//
	// }

	public static pair[] permute(int[] give){
		ArrayList<pair> pairs = new ArrayList<pair>();
		for(int i = 0; i<give.length-1; i++){
			for(int j = i+1; j < give.length; j++){
				pair pair1 = new pair(give[i], give[j]);
				//System.out.println(pair1.first+" "+pair1.second);
				pairs.add(pair1);
			}
		}
		pair[] newarr = new pair[pairs.size()];

		return pairs.toArray(newarr);

	}
	public static pair[] permutemouse(int[] give){
		ArrayList<pair> pairs = new ArrayList<pair>();
		int newsize = (give.length/2)*2;
		for(int i = 0; i<newsize; i+=2){
			pair p1 = new pair(give[i], give[i+1]);
			pairs.add(p1);
		}

		pair[] newarr = new pair[pairs.size()];
		return pairs.toArray(newarr);

	}

	public static boolean checkPair(pair[] me, pair[] mouse){
		boolean flag = false;
		for(int i = 0; i < me.length; i++){
			for(int j = 0; j<mouse.length; j++){
				if(me[i].compareTo(mouse[j])==0){
					// System.out.println(me[i].first+" "+me[i].second);
					// System.out.println(mouse[j].first+" "+mouse[j].second);
					return true;
				}
			}
		}
		return false;
	}


}
