import java.util.Arrays;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return findMedian(nums1, nums2);
        }
        else {
            return findMedian(nums2, nums1);
        }


    }

    private static double findMedian(int[] shortnums, int[] longnums) {
        // 短
        int L_s = 0;
        int R_s = shortnums.length-1;

        // 长
        int L_l = 0;
        int R_l = longnums.length-1;

        while (L_s <= R_s) {
            int mids = L_s + (R_s - L_s) / 2;
            int midl = L_l + (R_l - L_l) / 2;

            double midnumber_s = mid(shortnums, L_s, R_s);
            double midnumber_l = mid(longnums, L_l, R_l);
            if (L_s == R_s) {
                int[] newnums = new int[2+R_l-L_l];
                for (int i = 0; i < R_l-L_l+1; i++) {
                    newnums[i] = longnums[i+L_l];
                }
                newnums[R_l-L_l+1] = shortnums[L_s];
                Arrays.sort(newnums);
                return mid(newnums, 0, newnums.length-1);

            }
            if (midnumber_s < midnumber_l) {
                int diff = mids + 1 - L_s;
                L_s = mids + 1;
                R_l -= diff;
            }
            else if (midnumber_s > midnumber_l) {
                int diff = R_s - mids;
                R_s = mids;
                L_l += diff;
            }
            else {
                return midnumber_s;
            }
        }
        return -1;
    }

    private static double mid(int[] nums, int L, int R) {
        int n = R - L + 1;
        if (n % 2 == 0) {
            return ((nums[(L+R)/2] + nums[(L+R)/2+1]) / 2.0);
        }
        else {
            return nums[((L+R)/2)];
        }
    }
}
