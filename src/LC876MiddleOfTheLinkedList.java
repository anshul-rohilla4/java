public class LC876MiddleOfTheLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2};
        ListNode head = LC21MergeTwoSortedLists.convertArrToLL(arr);

        ListNode ans=middleNode(head);


        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        System.out.println();
        System.gc();
    }
    public static ListNode middleNode(ListNode head) {

        //Two pass approach, first count length of LL and again traverse to the middle

//        if (head==null) return null;
//        if(head.next==null) return head; //single node
//
//        int count=0;
//        ListNode temp=head;
//        ListNode a=head;
//        while (a!=null){
//            a=a.next;
//            count++;
//        }
//
//        int mid;
//        mid=count/2;
//        mid++;
//
//        int i=0;
//        while (i<mid-1){
//            head=head.next;
//            i++;
//        }
//
//
//        return head;

        //slow and fast pointer approach
        if (head==null) return null;
        if(head.next==null) return head; //single node
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        head=slow;


        return head;
    }
}
