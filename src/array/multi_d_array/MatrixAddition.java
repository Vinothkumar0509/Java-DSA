package array.multi_d_array;

public class MatrixAddition {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,56};

        int row = 3, col = 3;

        int[][] firstMatrix = {{1, 2, 3},
                {2, 3, 4},
                {5, 6, 7}
        };

        int[][] secondMatrix = {{1, 2, 3},
                {2, 3, 4},
                {5, 6, 7}
        };

        int[][] output = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                output[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }


        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
