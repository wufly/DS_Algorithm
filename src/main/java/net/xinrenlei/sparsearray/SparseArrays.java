package net.xinrenlei.sparsearray;

public class SparseArrays {
    public static void main(String[] args) {
        int[][] chessArrays = new int[11][11];
        chessArrays[1][2] = 1;
        chessArrays[2][3] = 2;

        for (int[] row: chessArrays){
            System.out.println();
            for (int data: row){
                System.out.printf("%d\t", data);
            }
        }
    }
}
