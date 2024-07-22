import org.junit.Test;

public class test {

    @Test
    public void test1(){
        LRUCache LRU = new LRUCache(2);
        LRU.put(1,1);
        LRU.put(2,2);
        System.out.println(LRU.get(1));
        LRU.put(3,3);
        System.out.println(LRU.get(2));

        LRU.put(4,4);
        System.out.println(LRU.get(1));
        System.out.println(LRU.get(3));
        System.out.println(LRU.get(4));
    }

    @Test
    public void test2(){
        LRUCache LRU = new LRUCache(2);
        System.out.println(LRU.get(2));
        LRU.put(2,6);
        System.out.println(LRU.get(1));
        LRU.put(1,5);
        LRU.put(1,2);
        System.out.println(LRU.get(1));
        System.out.println(LRU.get(2));

    }

}
