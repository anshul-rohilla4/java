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
        int[] arr={1,2,2,1};
        ListNode head=converArrToLL(arr);



    }
//    public static boolean isPalindrome(ListNode head) {
//
//
//    }


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
