public class singlyLinkedList{
    private Node head;
    private int size;

    public void printList() {
    Node curr = head;
    while (curr != null) {
        System.out.print(curr.data + " -> ");
        curr = curr.next;
    }
    System.out.println("null");
}

    private static class Node {
        int data;
        Node next;
        Node(int data){ this.data = data; }
    }
    public singlyLinkedList(){
        head = null ;
        size = 0;
    }
    // Insertion 
    // Insertion at the beginning- O(1)
    public void insertAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;// new node points to old head 
        head = newNode;// new node appointed as new head
        size++;
    }
    // Insertion At the End- O(N) without a tail pointer , O(1) with tail pointer
    public void insertAtTail(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        size++;
    }
    // Insertion At any Given Point
    public void insertAtPosition(int pos , int val){
        if(pos < 0 || pos > size) throw new IndexOutOfBoundsException();
        if(pos == 0){
            insertAtHead(val); return;
        }
        Node newNode = new Node(val);
        Node prev = head;
        for(int i = 0 ; i< pos-1 ; i++){
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }
    // Deletion
    // Deletion from the head - O(1)
    public void deleteHead(){
        if(head == null) return;
        head = head.next;
        size--;
    }
    // Deletion From Tail -O(N) 
    public void deleteTail(){
        if(head == null) return;
        if(head.next == null){head = null; size--; return;}
        Node curr =head;
        while(curr.next.next != null){
            curr =curr.next;
        }
        curr.next = null;
        size--;
    }
    // Deletion first node atching a value - O(n)
    public boolean deleteValue(int val){
        if(head == null) return false ;
        if(head.data == val ) { head = head.next; size--; return true;}

        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            if(curr.data == val){
                prev.next = curr.next;
                size--;
                return true;
            }
            prev = curr ;
            curr = curr.next;
        }
        return false;
    }
    // Deletion At a Given Index - O(n)
    public void deleteAtPosition(int pos){
        if(pos < 0 || pos > size) throw new IndexOutOfBoundsException();
        if(pos == 0) {deleteHead(); return;}
        Node prev = head ;
        for(int i = 0 ; i< pos - 1 ; i++) prev = prev.next;
        prev.next = prev.next.next;
        size--;
    }
     public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();

        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.insertAtPosition(2, 99);
        list.deleteHead();
        list.deleteTail();
        list.deleteValue(99);
        list.deleteAtPosition(0);
        list.printList();  
    }
}