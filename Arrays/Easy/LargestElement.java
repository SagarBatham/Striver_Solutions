// Problem Link: https://takeuforward.org/arrays/largest-element/
// Example 1

// Input: nums = [3, 3, 6, 1]

// Output: 6

// Explanation: The largest element in array is 6
public class LargestElement{
    public static void main(String[] args){
        int[] nums={3, 3, 6, 1};
        System.out.println(Largest(nums));
    }

    public static int Largest(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        return max;
    }
}