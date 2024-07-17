class Solution {
    public static int findLength(int[] nums1, int[] nums2) {

        return nums1.length < nums2.length ? findMax(nums1, nums2) : findMax(nums2, nums1);

    }

    static int findMax(int[] A, int[] B) {
        int max = 0;
        int an = A.length, bn = B.length;
        for(int len=1; len <= an; len++) {
            max = Math.max(max, maxLen(A, 0, B, bn - len, len));
        }
        for(int j=bn-an; j >= 0;j--) {
            max = Math.max(max, maxLen(A, 0, B, j, an));
        }
        for(int i=1;i<an;i++) {
            max = Math.max(max, maxLen(A, i, B, 0, an - i));
        }
        return max;
    }


    private static int maxLen(int[] nums1, int i, int[] nums2, int j, int len) {
        int maxLen = 0;
        for (int l = 0; l < len; l++) {
            if (nums1[i+l] == nums2[j+l]) {
                maxLen+=1;
            }
        }
        return maxLen;
    }
}
