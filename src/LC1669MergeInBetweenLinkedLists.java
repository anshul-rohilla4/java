public class LC1669MergeInBetweenLinkedLists {

//Constraints:
//    3 <= list1.length <= 104
//    1 <= a <= b < list1.length - 1
//    1 <= list2.length <= 104

    public static void main(String[] args) {
        int[] list_1 = {10,1,13,6,9,5};
        int a = 3, b = 4;
        int[] list_2 = {1000000,1000001,1000002};

        ListNode list1= LC21MergeTwoSortedLists.convertArrToLL(list_1);
        ListNode list2= LC21MergeTwoSortedLists.convertArrToLL(list_2);

        ListNode temp= mergeInBetween(list1,a,b,list2);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head1=list1;
        ListNode head2=list2;

        int increment = 0;
        if(b-a>=0){
            increment=b-a+1;
        }

        int index=0;
        while(index<a-1){
            head1=head1.next;
            index++;
        }


        ListNode temp=head1;
        int count=0;
        while(temp!=null && count<=increment){

            temp=temp.next;
            count++;
        }

        head1.next=head2;
        while(head2.next!=null){
            head2=head2.next;
        }
        head2.next=temp;





        return  list1;
    }
}
