// Problem Link: https://takeuforward.org/arrays/three-sum/
// Find all unique triplets whose sum is zero.
// Example: nums = [-1, 0, 1, 2, -1, -4] -> [[-1, -1, 2], [-1, 0, 1]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        Arrays.sort(nums);
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+",");
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int idx = 0; idx < nums.length - 2; idx++) {

            if (idx > 0 && nums[idx] == nums[idx - 1]) {
                continue;
            }
            int first = nums[idx];

            int i = idx + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = -(nums[i] + nums[j]);

                if (sum == first) {
                    List<Integer> ll = new ArrayList<>();
                    ll.add(first);
                    ll.add(nums[i]);
                    ll.add(nums[j]);
                    ans.add(new ArrayList<>(ll));
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }

                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                } else if (sum > first) {
                    i++;
                } else {
                    j--;
                }

            }
        }

        return ans;
    }
}
