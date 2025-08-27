import java.util.Comparator;
import java.util.PriorityQueue;

public class LC23Merge_k_SortedLists {
    public static void main(String[] args) {

        int[] arr1={2,6};
        int[] arr2={1,3,4};
        int[] arr3={1,4,5};

        ListNode head1=LC21MergeTwoSortedLists.convertArrToLL(arr1);
        ListNode head2=LC21MergeTwoSortedLists.convertArrToLL(arr2);
        ListNode head3=LC21MergeTwoSortedLists.convertArrToLL(arr3);
        ListNode[] lists={head1, head2, head3};
        ListNode head=mergeKLists(lists);
        while (head != null) {
            System.out.print(head.val + " ");
            head= head.next;
        }
        System.out.println();
    }
    public static ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> heap=new PriorityQueue<>((a, b)-> a.val - b.val);

        for(int i=0;i<lists.length;i++){  //pushing the heads into the min heap;
            if(lists[i]!=null) {
                heap.add(lists[i]);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!heap.isEmpty()){
            ListNode min=heap.poll();  //exit the lowest value
            tail.next=min;
            tail=tail.next;
            if(min.next!=null){
                heap.add(min.next);// add the next node from the min value head
            }
        }

        dummy=dummy.next; //  for the dummy 0 val
        System.gc();




        return dummy;
    }
}
