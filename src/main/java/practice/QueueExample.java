package practice;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shefali.jain
 */
public class QueueExample {

    public static void main(String[] args) {
        QueueExample queueExample = new QueueExample();
        queueExample.queueInsertion();
        queueExample.dequeueInsertion();
    }
    public void queueInsertion() {
        final Queue<String> queue = new LinkedList<String>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");
       // queue.remove();
      //  queue.remove();
        queue.peek();
        queue.remove();
        System.out.println(queue);
    }

    public void dequeueInsertion() {
        final Deque<String> dequeue = new LinkedList<String>();
        dequeue.add("first");
        dequeue.add("second");
        dequeue.add("third");
        dequeue.add("fourth");
        // queue.remove();
        //  queue.remove();
        dequeue.peek();
        dequeue.removeFirst();
        dequeue.removeLast();
        System.out.println(dequeue);
    }
}
