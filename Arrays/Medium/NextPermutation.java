// Problem Link: https://takeuforward.org/arrays/next-permutation/
// Rearrange numbers into the next lexicographically greater permutation.
// Example: nums = [1, 2, 3] -> [1, 3, 2]
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums={1,1,5};
        nextPermutation(nums); 
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }    
    }

    public static void nextPermutation(int[] nums) {
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        System.out.println(idx);
        int minIdx=idx+1;
        for(int i=idx+1;i<nums.length;i++){
            if(nums[minIdx]<nums[i]){
                minIdx=i;
                break;
            }
        }
        System.out.println(minIdx);

        int temp=nums[minIdx];
        nums[minIdx]=nums[idx];
        nums[idx]=temp;
    }
}
