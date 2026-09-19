// Problem Link: https://takeuforward.org/arrays/rotate-matrix/
// Rotate a square matrix by 90 degrees clockwise in-place.
// Example: matrix = [[1,2,3],[4,5,6],[7,8,9]] -> [[7,4,1],[8,5,2],[9,6,3]]
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        printArr(matrix);
        rotateMatrix(matrix);
        printArr(matrix);
    }

    public static void rotateMatrix(int[][] matrix) {
        transPostMatrix(matrix);
        for(int[] temp:matrix){
            revArr(temp);
        }
    }

    public static void revArr(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }

    public static void transPostMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                if(i!=j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    }

    static void printArr(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
