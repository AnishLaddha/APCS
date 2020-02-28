public class TimeCapsule{

	public static final int height = 0;
	public static final int csize = (height*2) - 1;
	

	public static void Star(){
		for(int n = 1; n <= height; n++){
			System.out.print(" ");
		}
		System.out.print("*");
		for(int n = 1; n <= height; n++){
			System.out.print(" ");
		}
	}

	
	public static void Top(){
		Star();
		System.out.println();
		for(int i = 1; i <= height; i++){
			
			for(int a = 1; a <= height - i; a++){
			System.out.print(" ");
			}

			System.out.print("/");

			for(int z = 1; z <= (2*i -1); z++){
				System.out.print("o");
			}

			System.out.println("\\");
			
			
			
		}
		
	}



	public static void topbottom(){
		System.out.print("|");
		for(int e = 1; e <= csize; e++){
			System.out.print("@");
		}
		System.out.println("|");

	}



	public static void edge(){
		System.out.print("|@");
		for(int e = 1; e <= csize-2; e++){
			System.out.print(" ");
		}
		System.out.println("@|");
	}


	public static void Center(){
		topbottom();
		for(int f = 1; f <= csize-2; f++){
			edge();

		}
		topbottom();
	}



public static void Bottom(){
		for(int i =height; i >= 1; i--){
			
			for(int a = 1; a <= height - i; a++){
			System.out.print(" ");
			}

			System.out.print("\\");

			for(int z = 1; z <= (2*i -1); z++){
				System.out.print("o");
			}

			System.out.println("/");
			
			
			
		}
		Star();

	}





	public static void main(String[] args) {
		Top();
		Center();
		Bottom();
		System.out.println("");
	}
}