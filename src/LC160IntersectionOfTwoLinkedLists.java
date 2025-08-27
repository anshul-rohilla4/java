public class LC160IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {

        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // List A: 3 -> 7 -> 8 -> 10
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        // List B: 99 -> 1 -> 8 -> 10
        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;

        // Call your function here
        ListNode ans = getIntersectionNode(headA, headB);

        if (ans != null) {
            System.out.println("Intersection at node with value: " + ans.val);
        } else {
            System.out.println("No intersection");
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a=headA;
        ListNode b=headB;

        int lengthA=0,lengthB=0;
        while(a!=null) {lengthA++; a=a.next;}
        while(b!=null) {lengthB++; b=b.next;}

        int diff=Math.abs(lengthA-lengthB);

        a=headA;
        b=headB;

        if(lengthA>lengthB){
            int count=0;
            while(count<diff){
                a=a.next;
                count++;
            }
        }else {
            int count=0;
            while(count<diff){
                b=b.next;
                count++;
            }
        }
        while (a!=null && b!=null){
            if(a==b) return a;
            a=a.next;
            b=b.next;
        }

        return null;
    }



}
