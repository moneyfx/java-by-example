package array;

import java.util.ArrayList;

public class ZeroMatrix {

    public static int[][] convert(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<Integer>();
        ArrayList<Integer> columns = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (Integer row : rows) {
            makeRowZero(matrix, row);
        }

        for (Integer column : columns) {
            makeColumnZero(matrix, column);
        }

        return matrix;
    }

    public static void makeRowZero(int[][] matrix, int rowNumber) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[rowNumber][j] = 0;
        }
    }

    public static void makeColumnZero(int[][] matrix, int columnNumber) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][columnNumber] = 0;
        }
    }
}
