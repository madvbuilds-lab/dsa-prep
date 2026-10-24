class SwappingKthNodes {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void swap(Node head, int k) {
        
        Node first = head;
        for (int i = 1; i < k; i++) {
            if (first == null) return;      
            first = first.next;
        }
        if (first == null) return;

        Node slow = head;
        Node fast = first;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        printList(a);       
        swap(a, 2);
        printList(a);      
    }
}