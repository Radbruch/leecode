import java.util.ArrayDeque;
import java.util.Hashtable;
import java.util.Queue;

class LRUCache {

    private Queue<Integer> quu;
    private int capacity;
    private Hashtable<Integer, Integer> table;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        quu = new ArrayDeque<>(this.capacity);
        table = new Hashtable<>(this.capacity);
    }

    public int get(int key) {
        if (table.containsKey(key)) {
            quu.remove(key);
            quu.add(key);
            return table.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (quu.size() < this.capacity || table.containsKey(key)) {
            quu.remove(key);
        } else {
            int pull = quu.poll();
            table.remove(pull);
        }
        quu.add(key);
        table.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
