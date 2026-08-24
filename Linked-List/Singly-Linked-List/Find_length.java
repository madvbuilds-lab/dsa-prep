class Node{
    Node next;
    Node(int data1){
        next = null;
    }
}
class Find_len {
    public static int length(Node head){
        int count =0 ;
        Node temp = head ;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class Find_length {
    public static void main(String[] args) {
        // Creating a sample linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        // Create Solution object


        // Find and print the length of linked list
        System.out.println("Length of Linked List: "
                           + Find_len.length(head));
    }
}