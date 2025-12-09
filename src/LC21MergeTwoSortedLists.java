 public class LC21MergeTwoSortedLists {
        public static void main(String[] args) {
            int[] arr1={1,2,4};
            int[] arr2={1,3,4};
            ListNode list1=convertArrToLL(arr1);
            ListNode list2=convertArrToLL(arr2);

            ListNode temp=mergeTwoLists(list1,list2);
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
            System.gc();

        }
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            if(list1==null) return list2;
            if(list2==null) return list1;

            ListNode head;
            if(list1.val <= list2.val){
                head=list1;
                list1=list1.next;
            }else{
                head=list2;
                list2=list2.next;
            }

            ListNode tail =head;

            while(list1!=null && list2!=null){
                if(list1.val <= list2.val){
                    tail.next=list1;
                    list1=list1.next;
                }else{
                    tail.next=list2;
                    list2=list2.next;
                }
                tail=tail.next;
            }

            if(list1!=null){
                tail.next=list1;
            }else{
                tail.next=list2;
            }
            return head;
        }
        public static ListNode convertArrToLL(int[] arr){
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
