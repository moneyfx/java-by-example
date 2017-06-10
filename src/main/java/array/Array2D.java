package array;

import java.util.*;

public class Array2D {
    public static void run() {
        length();
    }

    public static void length() {

        int[][] foo = new int[][] {
                new int[] { 1, 2, 3 },
                new int[] { 1, 2, 3, 4},
        };

        System.out.println(foo.length); //2
        System.out.println(foo[0].length); //3
        System.out.println(foo[1].length); //4

        System.out.println(Arrays.deepToString(foo));

        int[][] copyOfFoo = cloneMatrix(foo);
        System.out.println(Arrays.deepToString(copyOfFoo));
    }

    public static int[][] cloneMatrix(int[][] matrix) {
        int[][] c = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                c[i][j] = matrix[i][j];
            }
        }
        return c;
    }
}
