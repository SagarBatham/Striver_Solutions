// Find the floor and ceil of a target in a sorted array.
// Problem Link: https://takeuforward.org/arrays/floor-and-ceil-in-sorted-array/
// Example: nums = [1,2,4,6,8], target = 5 -> floor = 4, ceil = 6
public class FloorAndCeil {
    public static void main(String[] args) {
        // TODO: Add your solution.
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        int floor = -1;
        int ceil = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                floor = mid;
                break;
            }
            if (nums[mid] <= x) {
                floor = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                ceil = mid;
                break;
            }
            if (nums[mid] > x) {
                ceil = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] {
                floor == -1 ? -1 : nums[floor],
                ceil == -1 ? -1 : nums[ceil]
        };
    }
}
