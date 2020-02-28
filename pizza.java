// public class pizza{
// 	public static void main(String[] args) {
// 		int radius = 6;
// 		for(int i =1; i <= radius; i ++){
// 			for(int s = 1; s <= (radius-i); s++){
// 				System.out.print(" ");
// 			}
// 			for(int j = 1; j <= i; j++){
// 				char c = 'a';
// 				char d = (char) (c +(i-j));
// 				System.out.print(d);
				
// 			}
// 			for(int n = 1; n <=i; n++){
// 				if(n ==1){
// 					System.out.print("");
// 				}
// 				else{
// 					char c = 'a';
// 					char d = (char) (c +n -1);
// 					System.out.print(d);
// 				}
// 			}
// 			System.out.println("");
// 		}
// 	}
// }
public class pizza{
	public static void main(String[] args) {
		int radius = 7;
		for(int i =1; i <= radius; i ++){
			for(int s = 1; s <= (radius-i); s++){
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++){
				char c = 'a';
				char d = (char) (c +(i-j));
				System.out.print(d+" ");

			}
			for(int n = 1; n <=i; n++){
				if(n ==1){
					System.out.print("");
				}
				else{
					char c = 'a';
					char d = (char) (c +n -1);
					System.out.print(d+ " ");
				}
			}
			System.out.println("");
		}
	}
}