public class Solution {
    public static int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        int countCircle = 0;
        int startx;
        int starty;
        int offset = -1;
        int count = 1;


        while (countCircle < n/2) {
            // 第一圈从(0,0)到(0,n-1)
            startx = countCircle;
            starty = countCircle;
            for (int j = starty; j < n + offset; j++) {
                answer[startx][j] = count++;
            }
            starty = n + offset;
            for (int i = startx; i < n + offset; i++) {
                answer[i][starty] = count++;
            }
            startx = n + offset;
            for (int j = starty; j > 0 - offset - 1; j--) {
                answer[startx][j] = count++;
            }
            starty = countCircle;
            for (int i = startx; i > 0 - offset - 1; i--) {
                answer[i][starty] = count++;
            }
            countCircle++;
            offset--;
        }
        if (count == n*n) {
            answer[n/2][n/2]= count;
        }
        return answer;
    }
}
