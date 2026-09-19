// Problem Link: https://takeuforward.org/arrays/spiral-matrix/
// Return all matrix elements in spiral order.
// Example: matrix = [[1,2,3],[4,5,6],[7,8,9]] -> [1,2,3,6,9,8,7,4,5]

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix).forEach(e->System.out.print(e+" "));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int count=0;
        int minRow=0;
        int maxRow=matrix.length-1;
        int minCol=0;
        int maxCol=matrix[0].length-1;
        while(count<matrix.length*matrix[0].length){
            for (int i = minCol; i <= maxCol; i++) {
                ans.add(matrix[minRow][i]);
                count++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                ans.add(matrix[i][maxCol]);
                count++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                ans.add(matrix[maxRow][i]);
                count++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                ans.add(matrix[i][minCol]);
                count++;
            }
            minCol++;
        }

        return ans;
    }
}
