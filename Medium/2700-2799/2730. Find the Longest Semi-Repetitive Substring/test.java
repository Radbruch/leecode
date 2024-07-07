import org.junit.Test;

public class test {

    @Test
    public void test() {
        String s1 = "52233";
        int answer1 = Solution.longestSemiRepetitiveSubstring(s1);
        System.out.println(answer1);

        String s2 = "5494";
        int answer2 = Solution.longestSemiRepetitiveSubstring(s2);
        System.out.println(answer2);

        String s3 = "1111111";
        int answer3 = Solution.longestSemiRepetitiveSubstring(s3);
        System.out.println(answer3);
    }
}
