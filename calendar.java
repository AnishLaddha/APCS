import java.util.*;

public class calendar{
	public static void main(String[]args){

		Scanner console = new Scanner(System.in);

		System.out.println("Please enter the number of days in the month: ");
		int days = console.nextInt();

		System.out.println("Please enter the number of days of the first Sunday: ");
		int sunday = console.nextInt();
		
		System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
		edge();

		for(int i=0;i<7-sunday+1 && (sunday-1)>0;i++){
			System.out.print("|");
			empty();
		}

		for(int i=1;i<sunday && (sunday-1)>0;i++){
			System.out.print("|");	
			System.out.print(padded(i,4));
			System.out.print("  ");
		}

		for (int i=0; i<1 && (sunday-1)>0;i++) {
			System.out.println("|");
		}


		for(int i=sunday;i<=days;){
			int j;
			System.out.print("|");
			for(j=0;j<7 && i<=days;j++){
				System.out.print(padded(i,4));
				System.out.print("  |");
				i++;
			}
			for (int k=j; k < 7; k++) {
				empty();
				System.out.print("|");
			}
			System.out.println();
		}

		edge();

	}
	public static void edge(){
		System.out.print("+");
		for(int i=0;i<7;i++){
			System.out.print("------+");
		}
		System.out.println();
	}
	public static void empty(){
		for(int i=0;i<6;i++){
			System.out.print(" ");
		}

	}
	public static String padded(int n, int width){
		String s = "" + n;
		for(int i = s.length();i<width;i++){
			s = " " + s;
		}
		return s;
	}	
}