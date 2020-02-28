import java.util.*;
public class Dumbasses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // how to declare a 2-d array
        int[][] twod = new int[3][4]; // creates array of 3 rows 4 columns
        System.out.println(twod.length); // prints 3
        System.out.println(twod[0].length); // prints 4 – the 0 can be swapped with any int from 0-2 and it would still work

        // array looks like this
        /* 0 0 0 0
           0 0 0 0
           0 0 0 0 */

        // iterating through the array and setting the value of a cell in the array
        for (int i = 0; i < twod.length; i++) {
            for (int j = 0; j < twod[i].length; j++) {
                twod[i][j] = 5;
            }
        }

        // array looks like this
        /* 5 5 5 5
           5 5 5 5
           5 5 5 5 */

        // accessing the individual cells of an array
        System.out.println(twod[2][0]); // prints the element in the third column fist row (5)

        // assigning array elements by console input
        for (int i = 0; i < twod.length; i++) {
            for (int j = 0; j < twod[i].length; j++) {
                twod[i][j] = input.nextInt();
            }
        }

        // in above example values are assigned first left -> right, then downwards through the array

        // printing all elements in the first row — swap 0 with any value 0-2
        for (int i = 0; i < twod[0].length; i++) {
            System.out.print(twod[0][i] + " ");
        }

        System.out.println();

        // if array looks like this:
        /* a b c d
           e f g h
           k l m n */
        // then output is:
        // a b c d

        // printing all elements in the first column — swap 0 with any value 0-3
        for (int i = 0; i < twod.length; i++) {
            System.out.print(twod[i][0] + " ");
        }

        System.out.println();

        // if array looks like this:
        /* a b c d
           e f g h
           k l m n */
        // then output is:
        // a e k
    }

}
