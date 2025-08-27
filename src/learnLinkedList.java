class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

public class learnLinkedList {
    public static void main(String[] args) {
        int[] arr={2,5,6,9};
        Node y=new Node(arr[0]);
//        System.out.println(y.data);

        Node head =convertArrToLL(arr);
//        System.out.println(head.data);

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" "+temp.next+"  ");
            temp=temp.next;
        }
        System.out.println();

        int length=lengthOfLL(head);
        System.out.println("length: "+length);

        System.out.println(indexInLL(head,9));

        System.out.println(deletionOfHead(head).data);

        head=deleteMiddleNode(head,5);
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    private static Node convertArrToLL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
    return head;
    }

    private static int lengthOfLL(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    private static int indexInLL(Node head,int target){
        int index=0;
        Node temp=head;
        while(temp!=null) {
            if (temp.data == target) {
                return index;
            }
            index++;
            temp=temp.next;

        }
        return -1;

    }

    private static Node deletionOfHead(Node head){
        head=head.next;
        return head;
    }

    private static Node deleteMiddleNode(Node head,int target){

        if(head==null || head.next==null) return head;

        if(head.data==target){  //if target is first Node
            head=head.next;
            return head;
        }

        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==target){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }


}


