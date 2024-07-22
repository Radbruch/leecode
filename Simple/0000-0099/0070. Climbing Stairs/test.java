import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void test1(){
        assertEquals(1, Solution.climbStairs(1));
    }

    @Test
    public void test2(){
        assertEquals(2, Solution.climbStairs(2));
    }

    @Test
    public void test3(){
        assertEquals(3, Solution.climbStairs(3));
    }

    @Test
    public void test4(){
        assertEquals(5, Solution.climbStairs(4));
    }
}
