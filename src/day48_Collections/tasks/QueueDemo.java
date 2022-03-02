package day48_Collections.tasks;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(12, 200, 300, 40, 90));

        Queue<Integer> arrayDequeue = new ArrayDeque<>();
        arrayDequeue.addAll(Arrays.asList(12, 200, 300, 40, 90));

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(12, 200, 300, 40, 90));


        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("arrayDequeue = " + arrayDequeue);
        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------------");
        System.out.println(((LinkedList) linkedList).get(2));
        //System.out.println(((PriorityQueue) priorityQueue).get(2)); // it does not work
        System.out.println((((ArrayDeque) arrayDequeue).getFirst()));

        System.out.println("------------------------------------------");
        for (Integer each : priorityQueue) {
            System.out.print(each + " ");
            System.out.println();

        }

        System.out.println("------------------------------------------");
        for (Integer each : linkedList) {
            System.out.print(each + " ");
            System.out.println();

        }

        System.out.println("------------------------------------------");
        for (Integer each : linkedList) {
            System.out.print(each + " ");
            System.out.println();

        }


/*
        System.out.println("------------------------------------------");
        priorityQueue.poll();
        arrayDequeue.poll();
        linkedList.poll();

        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("arrayDequeue = " + arrayDequeue);
        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------------");

        priorityQueue.poll();
        arrayDequeue.poll();
        linkedList.poll();

        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("arrayDequeue = " + arrayDequeue);
        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------------");

        priorityQueue.poll();
        arrayDequeue.poll();
        linkedList.poll();

        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("arrayDequeue = " + arrayDequeue);
        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------------");

        priorityQueue.poll();
        arrayDequeue.poll();
        linkedList.poll();

        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("arrayDequeue = " + arrayDequeue);
        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------------");

        priorityQueue.poll();
        arrayDequeue.poll();
        linkedList.poll();

        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("arrayDequeue = " + arrayDequeue);
        System.out.println("linkedList = " + linkedList);

 */




    }

}
