import org.junit.Test;

public class test {
    @Test
    public void test() {

        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        String answer1 = Solution.minWindow(s1, t1);
        System.out.println(answer1);

        String s2 = "a";
        String t2 = "a";
        String answer2 = Solution.minWindow(s2, t2);
        System.out.println(answer2);

        String s3 = "a";
        String t3 = "aa";
        String answer3 = Solution.minWindow(s3, t3);
        System.out.println(answer3);
    }
}
