public class doublyLinkedList {
    public static Node insertAtTail(Node head , int k){
        Node newNode = new Node(k);
        if(head ==null){
            return newNode;
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = newNode;
        newNode.prev = tail;
        return head;
    }
    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static Node convertArr2DLL (int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i< arr.length; i++){
            Node temp = new Node(arr[i], null,prev);
            prev.next = temp ;
            prev = temp ;
        } 
        return head;
    }
    static class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        data = data1;
        next = next1;
        prev = prev1;
    }

    Node(int data1) {
        data = data1;
        next = null;
        prev = null;
    }
}
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        Node head = convertArr2DLL(arr);
        System.out.println(head);
        head = insertAtTail(head,10);
        print(head);
    }
}
