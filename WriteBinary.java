import java.util.*;


public class maps{
  public static void main(String[] args) {
    System.out.print("Enter an integer: ");
    Scanner console = new Scanner(System.in);
    int n = console.nextInt();
        if (n==0){
            System.out.print(n);
        }
        else{
            sum(n);
        }
    System.out.println();
  }
  public static void sum(int sum){
    if(sum<0){
      System.out.print("-");
      sum = -sum;
    }

    if (sum == 0) {


    }

    else{

        sum((sum-sum%2)/2);
        System.out.print(sum%2);

    }


}

}
