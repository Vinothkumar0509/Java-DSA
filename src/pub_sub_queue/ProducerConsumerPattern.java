package pub_sub_queue;

import java.util.concurrent.atomic.AtomicInteger;

public class ProducerConsumerPattern {

    public static void main(String[] args) {
        int capacity = 5;
        BlockingQueueDemo blockingQueueDemo = new BlockingQueueDemo(capacity);
        AtomicInteger i = new AtomicInteger(1);


        new Thread(() -> {
            while(i.get() <= 10) {
                System.out.println(blockingQueueDemo.add(i.getAndIncrement()));
            }
        }, "Pusher Thread").start();

        new Thread(() -> {
            while(i.get() <= 10) {
                System.out.println(blockingQueueDemo.add(i.getAndIncrement()));
            }
        }, "Remove Thread").start();

        AtomicInteger j = new AtomicInteger(1);

        new Thread(() -> {
            while(j.get() <= 10) {
                System.out.println(blockingQueueDemo.remove(j.getAndIncrement()));
            }
        }).start();


        System.out.println("Q Size "+blockingQueueDemo.size());
    }
}