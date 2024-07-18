import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test {

    @Test
    public void test1(){
        int x = 121;
        assertEquals(true, Solution.isPalindrome(x));
    }

    @Test
    public void test2(){
        int x = -121;
        assertEquals(false, Solution.isPalindrome(x));
    }

    @Test
    public void test3(){
        int x = 100;
        assertEquals(false, Solution.isPalindrome(x));
    }

}
