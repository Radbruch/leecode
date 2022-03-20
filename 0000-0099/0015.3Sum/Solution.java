class Solution {

    private static class Quick {
        private Quick() {}

        private static void Sort(int[] a) {
            Sort(a, 0, a.length - 1);
        }

        private static void Sort(int[] a, int lo, int hi) {
            if (lo >= hi) return;
            int j = partition(a, lo, hi);
            Sort(a, lo, j - 1);
            Sort(a, j + 1, hi);
        }

        private static int partition(int[] a, int lo, int hi) {
            int i = lo;
            int j = hi + 1;
            int v = a[lo];
            while (true) {
                while (v > a[++i]) {
                    if (i == hi) break;
                }
                while (v < a[--j]) {
                    if (j == lo) break;
                }
                if (i >= j) break;
                exch(a, i, j);
            }
            exch(a, lo, j);
            return j;
        }

        private static void exch(int[] a, int i, int j) {
            int swap = a[i];
            a[i] = a[j];
            a[j] = swap;
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Quick.Sort(nums);
        if (nums[0] > 0) return new ArrayList<>();
        if (nums[nums.length-1] < 0) return new ArrayList<>();

        int v = 0 - 1;
        int i; // left point
        int j; // right point
        while (nums[++v] <= 0) {
            if (v > 0 && nums[v] == nums[v-1]) continue;
            i = v+1;
            j = nums.length-1;
            while(i < j) {
                if (i > v+1 && nums[i] == nums[i-1]) {
                    i++;
                    continue;
                }

                int sum = nums[i] + nums[j];
                if (sum > -nums[v]) j-=1;
                else if (sum < -nums[v]) i+=1;
                else {
                    List x = new ArrayList(3);
                    x.add(nums[v]);
                    x.add(nums[i]);
                    x.add(nums[j]);
                    ans.add(x);
                    i++;
                    j--;
                }
            }
            if (nums[v] == 0) break;
        }
        return ans;
    }
}


