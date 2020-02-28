import java.util.Scanner;
public class pell {

    public static void main(String args[])
    {
      Scanner console = new Scanner (System.in);
      System.out.print(" Number: ");
      int abc = console.nextInt();
	int n,a=1,b=0,c=1;
    for(n=1; n<=abc; n++)
     {
      c= a + 2*b;
      a = b;
      b = c;
     }
    int i, x=1, y=0;
    int z=1;
     for(i=1; i<=abc+1; i++)
     {
      z= x + 2*y;
      x = y;
      y = z;
     }
     System.out.println(c +"/"+ z);

t bgbg   }
