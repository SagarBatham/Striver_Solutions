// Problem Link: https://takeuforward.org/arrays/rem-duplicates/
// Remove duplicates from sorted array
// An array sorted in non-decreasing order is an array where every element to the right of an element is either equal to or greater in value than that element.


// Example 1

// Input: nums = [0, 0, 3, 3, 5, 6]

// Output: 4

// Explanation:

// Resulting array = [0, 3, 5, 6, _, _]

// There are 4 distinct elements in nums and the elements marked as _ can have any value.
public class RemDuplicates {
    public static void main(String[] args) {
        int[] nums={0,0,3,3,5,6};
        System.out.println(disIdx(nums));
    }

    public static int disIdx(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
