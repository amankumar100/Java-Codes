/* Write a java program to print Square hollow pattern.

******
*    *
*    *
*    *
*    *
******  

*/

import java.util.*;

public class squarehollowpattern {
    public static void main(String args[]) {
        int i, j, n = 6;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
