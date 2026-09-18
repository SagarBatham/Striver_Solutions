// Problem Link: https://takeuforward.org/arrays/set-matrix-zeroes/
// Set an entire row and column to zero when a matrix cell is zero.
// Example: matrix = [[1,1,1],[1,0,1],[1,1,1]] -> [[1,0,1],[0,0,0],[1,0,1]]
import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] nums={{1,1,1},{1,0,1},{1,1,1}};
        int[] row=new int[nums.length];
        int[]col=new int[nums[0].length];
        Arrays.fill(row, 1);
        Arrays.fill(col, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if(nums[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        
        setZeroes(nums,row,col);
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] nums,int[] row,int[] col) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if(row[i]==0 || col[j]==0){
                    nums[i][j]=0;
                }
            }
        }
    }
}
