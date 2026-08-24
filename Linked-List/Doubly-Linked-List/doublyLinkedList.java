public class DoublyLinkedList {
    static class Node {
        int data;
        Node next;
        Node back;

       
        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }

        
        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }

    
    public static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    
    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    
    public static Node insertAtTail(Node head, int k) {
        Node newNode = new Node(k);

        if (head == null) {
            return newNode;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = newNode;
        newNode.back = tail;
        return head;
    }

    
    public static Node deleteAtTail(Node head) {
        
        if (head == null || head.next == null) {
            return null;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node newTail = tail.back;
        newTail.next = null;   
        tail.back = null;     

        return head;
    }

    
    public static Node reverseDLL(Node head) {
        if (head == null || head.next == null) {
            return head;  
        }

        Node current = head;
        Node temp = null; 

        while (current != null) {
            temp = current.back;       
            current.back = current.next; 
            current.next = temp;        
            current = current.back;     
        }

        if (temp != null) {
            head = temp.back;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 7, 4};

        Node head = convertArr2DLL(arr);

        System.out.println("Doubly Linked List Initially: ");
        print(head);

        System.out.println("\nDoubly Linked List After Inserting at the tail with value 10: ");
        head = insertAtTail(head, 10);
        print(head);

        System.out.println("\nDoubly Linked List After Deleting the tail: ");
        head = deleteAtTail(head);
        print(head);

        System.out.println("\nDoubly Linked List After Reversing: ");
        head = reverseDLL(head);
        print(head);
    }
}
