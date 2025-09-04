/* Java Program to print Zero-One triangle

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 

*/

import java.util.*;
public class zero_one_triangle {
    public static void main(String args[]) {
        int i, j, n = 6;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
