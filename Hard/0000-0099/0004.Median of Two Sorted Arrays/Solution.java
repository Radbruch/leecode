import java.util.Arrays;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int total_left = (m+n+1)/2;
        int L_i = 0;
        int R_i = m;

        while (L_i < R_i) {
            int i = (L_i+R_i) / 2; // nums1的index，nums1选中了前i个数
            int j = total_left - i; // nums2的index，nums2选中了前j个数
            if (nums1[i] < nums2[j-1]) {
                L_i = i + 1;
            }
            else {
                R_i = i;
            }
        }
        int i = L_i;
        int j = total_left - i;

        int nums1LeftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int nums2LeftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int nums1RightMin = i == m ? Integer.MAX_VALUE : nums1[i];
        int nums2RightMin = j == n ? Integer.MAX_VALUE : nums2[j];
        if ((m + n) % 2 == 1) {
            return Math.max(nums1LeftMax, nums2LeftMax);
        } else {
            return (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2.0;
        }
    }
}
