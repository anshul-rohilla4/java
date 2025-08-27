public class LC203RemoveLinkedListElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = LC21MergeTwoSortedLists.convertArrToLL(arr);

        int val = 6;

        ListNode ans = removeElements(head, val);


        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        System.out.println();
        System.gc();
    }

    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        while (head != null && head.val == val) head = head.next; //skip initial nodes equal to val


        ListNode a = head;

        while (a!=null && a.next!=null){
            if(a.next.val==val){
                a.next=a.next.next;
            }
            else {
                a = a.next;
            }
        }

        return head;
    }
}
