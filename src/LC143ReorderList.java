public class LC143ReorderList {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5};
        // out ->   1,5,2,4,3
        ListNode head= LC21MergeTwoSortedLists.convertArrToLL(arr);
        reorderList(head);


        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }



    public static void reorderList(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode second=reverse(slow.next);
        slow.next=null;

        ListNode temp=head;

        while(second!=null){
            ListNode t=temp.next;
            temp.next=second;
            second=second.next;
            temp=temp.next;
            temp.next=t;
            temp=t;
        }




    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;

            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }




}
