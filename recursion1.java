import java.util.*;
public class recursion1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("enter:");
        int number = console.nextInt();
        System.out.println();



        numrecursion(number,number);
    }
    // public static void infiniteRecursion(int num){
    //     System.out.println(num);
    //     infiniteRecursion(num+1);
    // }
    public static void printstarrecursion(int num){
        if (num == 0){
            return;
        }
        else{
            System.out.println(num);
            printstarrecursion(num-1);
            System.out.println(num);            
        }
    }
    public static void numrecursion(int n, int i ){
        if(i == 0){
            return;
        }
        else{
            System.out.println(n-i+1);
            numrecursion(n,i-1);
            System.out.println(n-i+1);
        }
    }
}
