import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int nums1End = m + n - 1;
        while (p2 >= 0 ) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[nums1End] = nums1[p1];
                nums1End--;
                p1--;
            }
            else {
                nums1[nums1End] = nums2[p2];
                nums1End--;
                p2--;
            }
        }
    }
}

