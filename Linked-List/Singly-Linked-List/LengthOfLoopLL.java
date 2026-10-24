class LengthOfLoopLL{
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
    public static int lengthWithLoop(Node head) {
    Node slow = head, fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            
            int cycleLen = 1;
            Node temp = slow.next;
            while (temp != slow) {
                temp = temp.next;
                cycleLen++;
            }

            int tailLen = 0;
            Node p1 = head;
            Node p2 = slow;
            while (p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
                tailLen++;
            }

            return tailLen + cycleLen;
        }
    }
    int len = 0;
    Node temp = head;
    while (temp != null) {
        len++;
        temp = temp.next;
    }
    return len;
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
        e.next = b;
        int res = lengthWithLoop(a);
        System.out.print(res);
    }
}