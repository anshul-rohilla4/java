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

        int[] list_1 = {1,2,3};
        int[] list_2 = {1,3,4};

        ListNode list1= convertArrToLL(list_1);
        ListNode list2= convertArrToLL(list_2);

        ListNode temp= mergeTwoLists(list1,list2);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null)return list2;
        if(list2==null)return list1;

        ListNode head1=list1;
        ListNode head2=list2;

        ListNode dummy=null; //create a dummy node for the first node of result;

        if(head1.val<=head2.val){  //define the dummy node
            dummy=head1;
            head1=head1.next;
        }
        else {
            dummy=head2;
            head2=head2.next;
        }
        ListNode tail=dummy; // is the next node for dummy list

        while (head1 !=null && head2 !=null){ //simple compare each and move forward
            if(head1.val<=head2.val){
                tail.next=head1;
                head1=head1.next;

            }
            else {
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        if(head1==null){ //add the remaining part
            tail.next=head2;
        }else tail.next=head1;


        return dummy;
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


