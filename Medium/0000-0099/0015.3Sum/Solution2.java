import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for (int index = 0; index <= length - 3; index++) {
            if (index > 0 && nums[index] == nums[index-1]) {
                continue;
            }
            else if (nums[index]+nums[index+1]+nums[index+2] > 0) {
                break;
            }
            else if (nums[index]+nums[length-1]+nums[length-2] < 0) {
                continue; //注意这里是continue因为后面可能还有更大的
            }
            int left = index + 1;
            int right = length - 1;
            while (left < right) {
                int sum = nums[index] + nums[left] + nums[right];

                if (sum > 0) {
                    right -= 1;
                }
                else if (sum < 0) {
                    left += 1;
                }
                else {
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[left]);
                    result.add(nums[index]);
                    result.add(nums[right]);

                    results.add(result);
                    left += 1;
                    while (left < right && nums[left] == nums[left-1]) {
                        left += 1;
                    }
                    right -= 1;
                    while (left < right && nums[right] == nums[right+1]) {
                        right -= 1;
                    }
                }
            }
        }
        return results;
    }
}
