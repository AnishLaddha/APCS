import java.util.*;
public class WriteNums{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = console.nextInt();
        numrecursion(number,number);
        System.out.println();
    }
    public static void numrecursion(int n, int i ){
        if(i == 0){
            return;
        }
        else{
            if ((n-i+1)!=1){
                System.out.print(", ");
            }
            
            System.out.print(n-i+1);
            numrecursion(n,i-1);
            //System.out.println(n-i+1);
        }
    }

}