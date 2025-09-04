/* Java Program to print Number-increasing reverse pyramid pattern

1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/

import java.util.*;

public class numberincreasingreveresepyramid {
    public static void main(String args[]){
    {
        int i, j, n = 6;
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
