import org.junit.Test;

public class test {
    @Test
    public void test() {
        int[] test1 = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int result1 = Solution.trap(test1);
        System.out.println(result1);

        int[] test2 = new int[]{4,2,0,3,2,5};
        int result2 = Solution.trap(test2);
        System.out.println(result2);

        int result3 = SolutionPro.trap(test1);
        System.out.println(result3);

        int result4 = SolutionPro.trap(test2);
        System.out.println(result4);

    }
}
