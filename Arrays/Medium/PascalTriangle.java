// Problem Link: https://takeuforward.org/arrays/pascal-triangle/
// Generate the first N rows of Pascal's triangle.
// Example: n = 5 -> [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
public class PascalTriangle {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        while(i<=n){
            int j=1;
            int p=1;
            while(j<=i){
                
                System.out.print(p+" ");
                p=p*(i-j)/j;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
