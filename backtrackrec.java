import java.util.*;
public class backtrackrec{
    public static int count;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
        int x = console.nextInt();
        int y = console.nextInt();
        explore(x,y,0,0,"");
        System.out.println("Number of paths = "+count);
    }
    private static void explore(int targetx, int targety, int currx, int curry, String path){
        if(currx == targetx && curry == targety){
            count++;
            System.out.println("moves:"+path);
        }
        else if(currx <= targetx && curry <= targety){
            explore(targetx, targety, currx, curry+1, path+" N");
            explore(targetx, targety, currx+1, curry+1, path+" NE");
            explore(targetx, targety, currx+1, curry, path+" E");
            
        }
    }
}