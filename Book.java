import java.util.Scanner; 



public class Book{
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
   		System.out.println("Enter Integer: ");
    	int SIZE = myObj.nextInt();  // Read user input


		for(int n=1; n<=SIZE +1; n++){
			System.out.print(" ");
		}
		//This for loop creates the spaces befor the plus  at the top


		plusEdge(SIZE);
		System.out.println("");

		Top(SIZE);
		//top part created
		plusEdge(SIZE);
		//middle +--+ edge
		for(int n=1; n <= SIZE+1; n++){
			System.out.print("/");

		}

		/* prints the
		////
		///
		//
		/
		thung near the edge 
		*/
		System.out.println("");
		for(int n=1; n <= SIZE/2; n++){
			letters(n, SIZE);

		}
		//prints the words and the /////// thing on their side

		plusEdge(SIZE);
		/// bottom +---+
		System.out.println("");
	}
	public static void plusEdge(int SIZE){

		System.out.print("+");
		for(int n = 1; n <= SIZE*3; n++){
			System.out.print("-");

		}
		//print+ then for loop for - then plus
		System.out.print("+");
	}
	public static void Top(int SIZE){
		for (int i = 1; i <= SIZE; i++){

			for(int n = 1; n <= SIZE-i+1; n++){

			System.out.print(" ");
			}
			//print spaces at beginning of top
		System.out.print("/");
		for(int n = ((3*SIZE)-(3*i))-1; n >= 0; n--){
			System.out.print(" ");
		}
		//print the spaces after
		bigThing();
		for(int n = 1;  n<= i-1; n++){
			smallThing();
			}
		for(int n =1; n<=i; n++){
			System.out.print("/");
		}
		//print /// after ___/ things
			
		System.out.println("");

			}
		}
	public static void bigThing(){
		System.out.print("___/");
	}
	public static void smallThing(){
		System.out.print("__/");
	}
	public static void letters(int num, int SIZE){
		System.out.print("|");
		for(int n = 1; n <= ((3*SIZE)-22)/2; n++){
			System.out.print(" ");

		}
		//print spacs before letters
		System.out.print("Building Java Programs");
		for(int n = 1; n <= ((3*SIZE)-22)/2; n++){
			System.out.print(" ");
		}
		//spaces after letters
		System.out.print("|");

		for(int n = 1; n <= (SIZE-(2*num)+2); n++){
			System.out.print("/");
		}
		//print ///// after |
		System.out.println("");
	}
}