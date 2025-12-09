public class LC2AddTwoNumbers {
    public static void main(String[] args) {
        int[] arr1={9};
        int[] arr2={1,9,9,9,9,9,9,9,9,9};
        ListNode l1= LC21MergeTwoSortedLists.convertArrToLL(arr1);
        ListNode l2= LC21MergeTwoSortedLists.convertArrToLL(arr2);
        ListNode head=addTwoNumbers(l1,l2);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }

    //works for int sum
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        //first traverse through the LL and build the number;
//        //add the two numbers
//        //return the result new LL
//
//        ListNode head1=l1;
//        ListNode head2=l2;
//        int i1=0;
//        int i2=0;
//        int power=1;
//        while(head1!=null){
//            i1+=head1.val*power;
//            power*=10;
//            head1=head1.next;
//        }
//        power=1;
//        while(head2!=null){
//            i2+=head2.val*power;
//            power*=10;
//            head2=head2.next;
//        }
// //        System.out.println(i1);
// //        System.out.println(i2);
//
//        //gives integer overflow if i1 or i2 is large.
//        int res=i1+i2; //final numerical value
// //        System.out.println(res);
//
//        if (res<10) return new ListNode(res); //single digit
//
//        ListNode result=new ListNode(0);
//        ListNode head=result;
//
//
//        while(res!=0){
//            int digit=res%10;
//            head.next=new ListNode(digit);
//            head=head.next;
//            res/=10;
//        }
//
//
//
//        return result.next;
//    }


    //for large int
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode res=new ListNode(0);
        ListNode temp=res;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int a=(l1!=null) ? l1.val : 0;
            int b=(l2!=null) ? l2.val : 0;

            int sum=a+b+carry;

            temp.next=new ListNode(sum%10);
            temp=temp.next;
            carry=sum/10;

            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        return res.next;
    }
}
