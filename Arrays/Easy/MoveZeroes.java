// Problem Link: https://takeuforward.org/arrays/move-zeroes/
// Move all zeroes to the end while preserving the order of non-zero elements.
// Example: nums = [0, 1, 0, 3, 12] -> [1, 3, 12, 0, 0]
public class MoveZeroes {
    public static void main(String[] args) {
       int[] nums={0, 1, 0, 3, 12};
       int i=0;
       int j=0;
       while(i<nums.length){
        if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
        }
        i++;
       }

       for (int j2 = j; j2 < nums.length; j2++) {
        nums[j2]=0;
       }
       for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]+" ");
        }
    }
}
