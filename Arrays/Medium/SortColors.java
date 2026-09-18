// Problem Link: https://takeuforward.org/arrays/sort-colors/
// Sort an array containing only 0, 1, and 2 in-place.
// Example: nums = [2, 0, 2, 1, 1, 0] -> [0, 0, 1, 1, 2, 2]
public class SortColors {
    public static void main(String[] args) {
        int[] nums={2, 0, 2, 1, 1, 0};
        sortZeroOneTwo(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void sortZeroOneTwo(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(k<j){
            if(nums[k]==2){
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j--;
            }else if(nums[k]==1){
                k++;
            }else{
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;
                k++;
            }
        }
    }
}
