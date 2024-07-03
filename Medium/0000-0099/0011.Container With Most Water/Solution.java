class Solution {

    public int maxArea(int[] height) {
        int leftpointer = 0;
        int rightpointer = height.length-1;
        int[] maxindex = new int[2];
        maxindex[0] = leftpointer;
        maxindex[1] = rightpointer;
        int maxans = (rightpointer - leftpointer ) * this.min(height[leftpointer], height[rightpointer]);
        while (leftpointer + 1 < rightpointer) {
            if (height[leftpointer] < height[rightpointer]) {
                leftpointer++;
            }
            else {rightpointer--;}
            int newarea = (rightpointer - leftpointer ) * this.min(height[leftpointer], height[rightpointer]);
            if (newarea > maxans) {
                maxindex[0] = leftpointer;
                maxindex[1] = rightpointer;
                maxans = newarea;
            }
        }
        return maxans;

    }

    private int min(int x, int y) {
        if (x > y) return y;
        else return x;
    }
}


