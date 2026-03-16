package pub_sub_queue;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueueDemo {

    private int capacity;
    private Queue<Integer> q;

    public BlockingQueueDemo(int capacity) {
        this.capacity = capacity;
        this.q = new LinkedList<>();
    }

    public boolean add(Integer element) {
        synchronized (q) {  // T1 T2 T3
            while(capacity == q.size()) { // T1 T2
                try {
                    q.wait(); // T1 T2
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            q.add(element);
            q.notifyAll();
            return true;
        }

    }

    public int remove(Integer element) {
        synchronized (q) {
            while(q.isEmpty()) {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            q.remove(element);
            q.notifyAll();
            return element;
        }

    }

    public int size() {
        return q.size();
    }
}