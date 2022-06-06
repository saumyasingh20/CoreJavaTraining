package june6;

public class DoublyLinkedList {
    static DoublyLLNode head;
    static class DoublyLLNode{
        int data;
        DoublyLLNode next;
        DoublyLLNode prev;

        public DoublyLLNode(int data) {
            this.data = data;
            this.next=null;
            this.prev = null;
        }
    }
    public static void printDoublyLL(){
     DoublyLLNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void printDoublyLL(DoublyLLNode head){
        DoublyLLNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static DoublyLLNode addFirst(DoublyLLNode nodeToBeInserted){
        if(head==null){
            head = nodeToBeInserted;
            return head;
        }
        nodeToBeInserted.next=head;
        head = nodeToBeInserted;
        return head;
    }
    public static DoublyLLNode addLast(DoublyLLNode nodeToBeInserted){
        if (head==null){
            head=nodeToBeInserted;
            return nodeToBeInserted;
        }
        DoublyLLNode temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=nodeToBeInserted;
        nodeToBeInserted.prev = temp;
        return head;
    }
    public static DoublyLLNode insertAfter(DoublyLLNode prev,DoublyLLNode newNode){
        newNode.prev = prev;
        newNode.next = prev.next;
        prev.next.prev = newNode;
        prev.next = newNode;
        return head;
    }
    public static DoublyLLNode deleteNode(int data){

        if(head==null)
            return null;

        DoublyLLNode temp = head;
        DoublyLLNode prev = head;

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
        temp.next.prev = prev;
        temp.prev=null;
        temp.next=null;
        return head;


    }

    public static void main(String[] args) {
        DoublyLLNode node1 = new DoublyLLNode(10);
        DoublyLLNode node2 = new DoublyLLNode(20);
        DoublyLLNode node3 = new DoublyLLNode(30);
        DoublyLLNode node4 = new DoublyLLNode(40);
        head = node1;
        node1.next=node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next= node4;
        node4.prev = node3;
        addFirst(new DoublyLLNode(5));
        addLast(new DoublyLLNode(60));

        insertAfter(node2,new DoublyLLNode(70));

        deleteNode(30);
        printDoublyLL();
    }
}
