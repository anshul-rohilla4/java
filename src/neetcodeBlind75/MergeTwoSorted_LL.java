package neetcodeBlind75;
class ListNode{
    int val;
    ListNode next;

    ListNode(int val, ListNode next1){
        this.val=val;
        this.next=next1;
    }
    ListNode(int data1){
        this.val=data1;
        this.next=null;
    }
}
public class MergeTwoSorted_LL {
    public static void main(String[] args) {

        int[] list_1 = {1,2,4};
        int[] list_2 = {1,3,5};

        ListNode list1= convertArrToLL(list_1);
        ListNode list2= convertArrToLL(list_2);

        ListNode temp= mergeTwoLists(list1,list2);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        return list1;
    }



    private static ListNode convertArrToLL(int[] arr){
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


