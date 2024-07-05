import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> results = new ArrayList<>();

        for (int index1 = 0; index1 < n - 3; index1++) {
            if (index1 > 0) {
                if (nums[index1] == nums[index1 - 1]) continue;
            }

            if ((long) nums[index1] + (long) nums[index1+1] + (long) nums[index1+2] + (long) nums[index1+3] > target) break;
            if ((long) nums[index1] + (long) nums[n-1] + (long) nums[n-2] + (long) nums[n-3] < target) continue;

            for (int index2 = index1 + 1; index2 < n - 2; index2++) {
                if (index2 > index1+1 && nums[index2] == nums[index2 - 1]) continue;

                if ((long) nums[index1] + (long) nums[index2] + (long) nums[index2+1] + (long) nums[index2+2] > target) break;
                if ((long) nums[index1] + (long) nums[index2] + (long) nums[n-1] + (long) nums[n-2] < target) continue;

                int index3 = index2+1;
                int index4 = n-1;
                while (index3 < index4) {
                    long sum = (long) nums[index1] + (long) nums[index2] + (long) nums[index3] + (long) nums[index4];
                    if (sum > target) {
                        index4 -= 1;
                        while (index4 > 0 && nums[index4] == nums[index4 + 1]) {
                            index4 -= 1;
                        }
                    }
                    else if (sum < target) {
                        index3 += 1;
                        while (index3 < n-1 && nums[index3] == nums[index3 - 1]) {
                            index3 += 1;
                        }
                    }
                    else {
                        List<Integer> newResult = new ArrayList<>();
                        newResult.add(nums[index1]);
                        newResult.add(nums[index2]);
                        newResult.add(nums[index3]);
                        newResult.add(nums[index4]);
                        results.add(newResult);
                        index3+=1;
                        index4-=1;
                        while (index3 < index4 && index4 > 0 && nums[index4] == nums[index4 + 1]) {
                            index4 -= 1;
                        }
                        while (index3 < index4 && index3 < n-1 && nums[index3] == nums[index3 - 1]) {
                            index3 += 1;
                        }
                    }
                }
            }
        }
        return results;
    }
}
