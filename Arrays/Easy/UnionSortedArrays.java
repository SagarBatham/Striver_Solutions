import java.util.ArrayList;
import java.util.Arrays;

public class UnionSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 4};

        int[] ans = unionArray(nums1, nums2);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {

                if (arr.size() == 0 ||
                    arr.get(arr.size() - 1) != nums1[i]) {
                    arr.add(nums1[i]);
                }

                i++;

            } else if (nums1[i] > nums2[j]) {

                if (arr.size() == 0 ||
                    arr.get(arr.size() - 1) != nums2[j]) {
                    arr.add(nums2[j]);
                }

                j++;

            } else {

                // Both are equal
                if (arr.size() == 0 ||
                    arr.get(arr.size() - 1) != nums1[i]) {
                    arr.add(nums1[i]);
                }

                i++;
                j++;
            }
        }

        while (i < nums1.length) {

            if (arr.get(arr.size() - 1) != nums1[i]) {
                arr.add(nums1[i]);
            }

            i++;
        }

        while (j < nums2.length) {

            if (arr.get(arr.size() - 1) != nums2[j]) {
                arr.add(nums2[j]);
            }

            j++;
        }

        int[] ans = new int[arr.size()];

        for (int k = 0; k < arr.size(); k++) {
            ans[k] = arr.get(k);
        }

        return ans;
    }
}
