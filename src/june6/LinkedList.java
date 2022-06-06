package june6;


public class LinkedList {
    static LinkedListNode head;
    static class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void printLL(){
        LinkedListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void printLL(LinkedListNode head){
        LinkedListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }


    public static LinkedListNode addFirst(LinkedListNode nodeToBeInserted){
        if(head==null){
            head = nodeToBeInserted;
            head.next=null;
            return nodeToBeInserted;
        }
        nodeToBeInserted.next = head;
        head = nodeToBeInserted;
        return nodeToBeInserted;

    }
    public static LinkedListNode addLast(LinkedListNode nodeToBeInserted){
        if (head==null){
            head=nodeToBeInserted;
            return nodeToBeInserted;
        }
        LinkedListNode temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=nodeToBeInserted;

        return head;
    }

    public static LinkedListNode insertAfter(LinkedListNode prev, LinkedListNode newNode){
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }
    public static LinkedListNode deleteNode(int data){

        if(head==null)
            return null;

        LinkedListNode temp = head;
        LinkedListNode prev = head;

        if (temp.data == data){
            head = temp.next;
            temp.next =null;
            return head;
        }
        while (temp.data != data && temp.next!=null){
                prev = temp;
                temp = temp.next;

        }
        prev.next = temp.next;
        temp.next=null;
        return head;


    }
    public static void main(String[] args) {
        head= new LinkedListNode(1);
        LinkedListNode two = new LinkedListNode(2);
        LinkedListNode three = new LinkedListNode(3);
        head.next=two;
        two.next=three;
//        printLL(head);
        LinkedListNode newHead= addFirst(new LinkedListNode(10));
//        printLL(newHead);
        addLast(new LinkedListNode(20));
//        System.out.println();
        insertAfter(three,new LinkedListNode(50));
        addLast(new LinkedListNode(80));
        insertAfter(head,new LinkedListNode(60));
        addFirst(new LinkedListNode(90));
//        printLL(newHead);


        deleteNode(100);

        printLL();

    }
}
