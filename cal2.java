import java.util.*;
public class cal2{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the number of days in the month: ");
		int numD = console.nextInt();
		System.out.println("Please enter the number of days of the first Sunday: ");
		int sunday = console.nextInt();

		System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
		System.out.println("+------+------+------+------+------+------+------+");
		String[][] days = new String[6][7];
		days[1][0] = Integer.toString(sunday);
		int n = 0;
		for(int i = 0; i < 6; i++){
			System.out.print("|");
			for(int j = 0; j < 7; j++){
				if(sunday == 1){
					days[i][j] = Integer.toString((i)*7+j+sunday);
				}
				else{
					days[i][j] = Integer.toString((i-1)*7+j+sunday);
				}
				
				if((Integer.parseInt(days[i][j]) <= 0)|| (Integer.parseInt(days[i][j]) > numD)){
					days[i][j] = "";
				}

				System.out.printf("%4s", days[i][j]);
				System.out.print("  |");
				
				
			}
			System.out.printf("%n","  |");
			;
		}
		System.out.println("+------+------+------+------+------+------+------+");




	}
}