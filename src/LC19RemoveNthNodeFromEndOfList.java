class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class LC19RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        int[] arr={1};
        int n=1;
        ListNode head=convertArrToLL(arr);
        head=removeNthFromEnd(head,n);

        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }


    }
    public static ListNode removeNthFromEnd(ListNode head, int n) { //nth element from end
        if(head.next==null){ //size is 1
            return null;
        }

        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;//calculate size
        }
        if(n==size){ //n is first element
            return head.next;
        }
        int index=0;
        ListNode mover=head;
        while(index!=size-n-1){
            mover=mover.next;
            index++; //index of element to be removed
        }

        mover.next=mover.next.next;

        return head;
    }

    public static ListNode convertArrToLL(int[] arr){
        ListNode head=new ListNode(arr[0]);
        ListNode mover=head;
        for(int i=1;i<arr.length;i++){
            ListNode temp=new ListNode(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
}
