import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // let m < n
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return intersection(nums2, nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < m; i ++) {
            if (i >= 1 && nums1[i] == nums1[i-1]) {
                continue;
            }
            else if (findInteger(nums1[i], nums2)) {
                list.add(nums1[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    private static boolean findInteger(int i, int[] nums2) {
        int L = 0;
        int R = nums2.length - 1;
        while (L <= R) {
            int mid = (L+R)/2;
            if (nums2[mid] == i) {
                return true;
            } else if (nums2[mid] > i) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return false;
    }
}
