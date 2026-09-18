// Problem Link: https://takeuforward.org/arrays/rearrange-by-sign/
// Rearrange positive and negative values alternately, starting with a positive value.
// Example: nums = [3, 1, -2, -5, 2, -4] -> [3, -2, 1, -5, 2, -4]
public class RearrangeBySign {
    public static void main(String[] args) {
       int[] nums={3, 1, -2, -5, 2, -4};
       printArr(nums);
       rearrangeArray(nums);
       printArr(nums);
    }

    public static void printArr(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int nl=n/2;
        int[] pNums=new int[nl];
        int[] nNums=new int[nl];
        int p1=0;
        int p2=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pNums[p1]=nums[i];
                p1++;
            }else{
                nNums[p2]=nums[i];
                p2++;
            }
        }
        
        p1=0;
        p2=0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0){
                nums[i]=pNums[p1];
                p1++;
            }else{
                nums[i]=nNums[p2];
                p2++;
            }
        }

        return nums;
    }
}
