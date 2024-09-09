
import java.util.*;


class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ans = new ArrayList<>();

        for (int[] interval: intervals) {
            int m = ans.size();
            if (m > 0 && interval[0] < ans.get(m-1)[1]) {
                ans.get(m-1)[1] = interval[1];
            } else {
                ans.add(interval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
