import java.util.*;
public class multiplicationrecursion{
    public static void main(String[] args) {
        System.out.print("enter: ");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int num2 = console.nextInt();
        System.out.println(multiply(num,num2));

    }
    public static int multiply(int number, int times){
        if(times == 1){
            return number;
        }
        else{
            return number+multiply(number,times-1);
        }
    }

}