import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
    *@ClassName Solution
    *@Description
    *@Author msjoy
    *@Date 2024/9/25 15:01
    *@Version 1.0
    **/
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 统计每个数字出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 小顶堆
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });

        // 维护一个大小为 k 的小顶堆
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if (pq.size() == k) {
                if (pq.peek()[1] < count) {
                    pq.poll();
                    pq.offer(new int[] {num, count});
                }
            } else {
                pq.offer(new int[] {num, count});
            }
        }

        // 取出堆中的元素
        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
