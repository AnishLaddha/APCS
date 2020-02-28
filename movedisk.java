import java.util.*;

public class movedisk{
    public static int count = 0;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = console.nextInt();
        System.out.print("Enter destination post: ");
        char dest = console.next().charAt(0);
        System.out.println("Moves:");
        if (dest == 'B'){
            moveDisks(n, 'A', 'B', 'C');
        }
        else{
            moveDisks(n, 'A', 'C', 'B');
        }
        System.out.println("Number of moves: "+count);
    }
    public static void moveDisks(int n, char source, char dest, char temp){
        count++;
        if(n==1){
            System.out.println(source + " -> "+ dest);
            return;
        }
        else{
            moveDisks(n-1, source,temp,dest);
            System.out.println(source + "->"+ dest);
            moveDisks(n-1,temp,dest,source);
        }
        
    }
    public static void moveOneDisk(char source, char dest){
        System.out.println("Move disk from"+source+ "->" + dest);
    }
}