public class SolutionPro {
    /*
    省内存的进阶版，本质是短板
    原理：谁小挪谁，挪的那个算水面积
     */
    public static int trap(int[] height) {
        int L = 0;
        int R = height.length-1;
        int premax = 0;
        int sermax = 0;
        int answer = 0;
        while (L <= R) {
            premax = Math.max(height[L],premax);
            sermax = Math.max(height[R],sermax);
            if (premax < sermax) {
                answer += premax - height[L];
                L ++;
            }
            else {
                answer += sermax - height[R];
                R --;
            }
        }
        return answer;
    }
}
