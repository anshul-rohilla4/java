import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LC1338ReduceArraySizeToTheHalf {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,7,7};
        System.out.println(minSetSize(arr));
    }
    public static int minSetSize(int[] arr) {
//        🔸 Approach:
//        1.Count frequencies of each number using a HashMap<Integer, Integer>.
//        2.Store frequencies in a max heap (PriorityQueue<Integer>, max heap by frequency).
//        3.Initialize:
//          removed = 0 → number of elements removed.
//          count = 0 → number of integers you've removed completely.
//        4.While removed < arr.length / 2:
//          Pop the highest frequency from the heap.
//          Add it to removed.
//          Increment count.
//        5.Return count.



        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int freq :map.values()){
            maxHeap.add(freq);
        }
        int removed=0;
        int size=arr.length;
        int setSize=0;

        while(removed<size/2){
            removed+=maxHeap.poll(); //removes the most frequent element;
            setSize++;
        }
        return setSize;



    }
}
