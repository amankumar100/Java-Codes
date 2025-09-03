/* Java Program to print number-increasing pyramid 

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 

*/

import java.util.*;

public class numberincreasingpyramid {
    public static void main(String args[]){
        int i, j, n = 6;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
