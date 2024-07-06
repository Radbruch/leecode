import org.junit.Test;

public class test {

    @Test
    public void test() {
        int[] test1 = new int[]{2,2,3,4};
        int answer1 = Solution.triangleNumber(test1);
        System.out.println(answer1);

        int[] test2 = new int[]{4,2,3,4};
        int answer2 = Solution.triangleNumber(test2);
        System.out.println(answer2);
    }
}
