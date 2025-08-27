import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        //Priority Queue = a FIFO data structures that serves elements with the highest priorities first before elements with lower priority.

        //stores data in a min-heap format
        //is a complete binary tree
            //at most 2 children
            // start from left node

        //parents node needs to be minimum value
        //children nodes have greater value


        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(0);
        pQueue.add(7);
        pQueue.add(8);
        pQueue.add(4);
        pQueue.add(3);
        pQueue.add(2);
        System.out.println(pQueue);
//                     0
//                   /   \
//                  3     2
//                /  \   /  \
//               7   4
//              /
//            8
    }

}
