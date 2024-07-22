import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {

    @Test
    public void test1(){
        String s = "()";
        assertEquals(true, Solution.isValid(s));
    }

    @Test
    public void test2(){
        String s = "()[]{}";
        assertEquals(true, Solution.isValid(s));
    }

    @Test
    public void test3(){
        String s = "(]";
        assertEquals(false, Solution.isValid(s));
    }

    @Test
    public void test4(){
        String s = "([)]";
        assertEquals(false, Solution.isValid(s));
    }

    @Test
    public void test5(){
        String s = "{[]}";
        assertEquals(true, Solution.isValid(s));
    }

    @Test
    public void test6(){
        String s = "(){}}{";
        assertEquals(false, Solution.isValid(s));
    }
}
