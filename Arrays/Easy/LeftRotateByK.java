// Problem Link: https://takeuforward.org/arrays/left-rotate-by-k/
// Left rotate an array by K places.
// Example: nums = [1, 2, 3, 4, 5], k = 2 -> [3, 4, 5, 1, 2]
public class LeftRotateByK {
    public static void main(String[] args) {
        int[]nums = {1, 2, 3, 4, 5};
        rotateArray(nums, 2);
    }

    public static void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        System.out.println(k);
        swap(nums, 0, k-1);
        printArr(nums);
        swap(nums, k, nums.length-1);
        printArr(nums);
        swap(nums, 0, nums.length-1);
        printArr(nums);
    }

    public static void swap(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;

            i++;
            j--;
        }
    }

    public static void printArr(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
