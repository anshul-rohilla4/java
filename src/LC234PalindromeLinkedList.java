import java.util.Stack;

//class ListNode{
//    int val;
//    ListNode next;
//
//    ListNode(int val,ListNode next){
//        this.val=val;
//        this.next=next;
//    }
//
//    ListNode(int val){
//        this.val=val;
//        this.next=null;
//    }
//}
public class LC234PalindromeLinkedList {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,1,1};
        ListNode head=converArrToLL(arr);
        System.out.println(isPalindrome(head));



    }
    public static boolean isPalindrome(ListNode head) {

        ListNode start=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        ListNode curr=slow;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }


        while(prev!=null){
            if(start.val!=prev.val)return false;

            prev=prev.next;
            start=start.next;
        }



        return true;
    }


    public static ListNode converArrToLL(int[] arr){
        ListNode head=new ListNode(arr[0]);

        ListNode index=head;
        for(int i=1;i<arr.length;i++){
            ListNode temp=new ListNode(arr[i]);
            index.next=temp;
            index=temp;
        }
        return head;
    }
}
