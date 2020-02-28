public class junk{
	public static final int SIZE = 6;
	
	public static void main(String[] args) {
		pyramid();

		
	}



	public static void pyramid(){
		for(int n = 1; n <= SIZE; n++){
			for(int x =1; x<= 4*(SIZE-n); x++){
				System.out.print("/");

			}
			for(int x =1; x<= 8*(n-1); x++){
				System.out.print("*");

			}
			/*for(int x =1; x<= 4*(n-1); x++){
				System.out.print("*");

			}*/
			for(int x =1; x<= 4*(SIZE-n); x++){
				System.out.print("\\");

			}
			System.out.println("");
		}

	}



}