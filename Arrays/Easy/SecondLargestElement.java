// Problem Link: https://takeuforward.org/arrays/second-largest-element/
// Example 1

// Input: nums = [8, 8, 7, 6, 5]

// Output: 7

// Explanation:

// The largest value in nums is 8, the second largest is 7
public class SecondLargestElement{
    public static void main(String[] args){
        int[] arr={8, 8, 7, 6, 5};
        System.out.println(SecondLargest(arr));
    }

    public static int SecondLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        int smax=max;
        for(int e:arr){
            if(max<e){
                smax=max;
                max=e;
                System.out.println("if: "+max +" "+ smax);
            }else if(smax<e && max!=e){
                smax=e;
                System.out.println("else if: "+max +" "+ smax);
            }
        }

        return smax;
    }
}