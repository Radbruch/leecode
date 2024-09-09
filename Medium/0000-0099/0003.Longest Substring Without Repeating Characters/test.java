import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName test
 * @Description TODO
 * @Author msjoy
 * @Date 2024/8/26 09:49
 * @Version 1.0
 **/

public class test {
    @Test
    public void test1(){
        String s = "abcabcbb";
        int answer = Solution3.lengthOfLongestSubstring(s);
        assertEquals(3,answer);
    }

    @Test
    public void test2(){
        String s = "bbbbb";
        int answer = Solution3.lengthOfLongestSubstring(s);
        assertEquals(1,answer);
    }

    @Test
    public void test3(){
        String s = "pwwkew";
        int answer = Solution3.lengthOfLongestSubstring(s);
        assertEquals(3,answer);
    }

    @Test
    public void test4(){
        String s = "au";
        int answer = Solution3.lengthOfLongestSubstring(s);
        assertEquals(2,answer);
    }

    @Test
    public void test5(){
        String s = "abcaefgaijklma";
        int answer = Solution3.lengthOfLongestSubstring(s);
        assertEquals(9,answer);
    }
}
