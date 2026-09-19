
import java.util.HashMap;

// Problem Link: https://takeuforward.org/arrays/count-subarrays-with-sum-k/
// Count subarrays whose sum equals K.
// Example: nums = [1, 1, 1], k = 2 -> 2
public class CountSubarraysWithSumK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int k = 3;
        postArray(arr, k);
        postNegArray(arr, k);
        
    }

    //If Negative Number are in Array
    public static void postArray(int[] arr,int k){

        int count = 0;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void postNegArray(int[] arr, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }

        System.out.println(count);
    }
}

