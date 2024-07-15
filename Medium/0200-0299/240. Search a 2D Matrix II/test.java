import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    @Test
    public void test1() {

        int[][] matrix1 = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
        //        {10, 13, 14, 17, 24},
        //        {18, 21, 23, 26, 30}
        };
        int target1 = 5;
        boolean result1 = Solution.searchMatrix(matrix1, target1);
        boolean espect1 = true;
        assertEquals(espect1, result1);
    }

    @Test
    public void test2(){

        int[][] matrix2 = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target2 = 20;
        boolean result2 = Solution.searchMatrix(matrix2,target2);
        boolean espect2 = false;
        assertEquals(espect2, result2);
    }

    @Test
    public void test3(){

        int[][] matrix3 = new int[][]{
                {1,3,5},
        };
        int target3 = -1;
        boolean result3 = Solution.searchMatrix(matrix3, target3);
        boolean espect3 = false;
        assertEquals(espect3, result3);
    }

    @Test
    public void test4(){

        int[][] matrix4 = new int[][]{
                {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}
        };
        int target4 = 15;
        boolean result4 = Solution.searchMatrix(matrix4, target4);
        boolean espect4 = true;
        assertEquals(espect4, result4);
    }
}
