package collection;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuesList {
    public static void main(String[] args) {
//        FIFO
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        q1.add(10);
        q1.add(20);
        q1.add(30);

        System.out.println("Head of queue is " + q1.element());

        try {
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
        for (Integer l:q1){
            System.out.println(l);
        }
//        Integer value = q1.remove(); // return the head of queue
        System.out.println("Removed from Queue" + q1.remove());
        System.out.println("Removed from Queue" + q1.remove());
        System.out.println("Removed from Queue" + q1.remove());

        try {
            System.out.println("Removed from Queue" + q1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Try to remove non existing element");
        }




        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        q2.offer(10);
        q2.offer(20);
        System.out.println("Queeu2 peek" + q2.peek());

        if (q2.offer(30) == false) {
            System.out.println("Offer fail to add element beyond the capacity");
        }

        for (Integer l:q2){
            System.out.println(l);
        }

        System.out.println("Queue2 poll" + q2.poll());
        System.out.println("Queue2 poll" + q2.poll());
        System.out.println("Queue2 poll" + q2.poll());

    }
}
