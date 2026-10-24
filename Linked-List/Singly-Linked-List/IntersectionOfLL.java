class IntersectionOfLL {
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
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node inter(Node head1, Node head2) {
        int l1 = 0;
        Node temp1 = head1;
        while (temp1 != null) {
            temp1 = temp1.next;
            l1++;
        }

        int l2 = 0;
        Node temp2 = head2;
        while (temp2 != null) {
            temp2 = temp2.next;
            l2++;
        }

        temp1 = head1;
        temp2 = head2;

        
        if (l1 > l2) {
            for (int i = 0; i < l1 - l2; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < l2 - l1; i++) {
                temp2 = temp2.next;
            }
        }

        
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;  
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node x = new Node(60);
        Node y = new Node(70);

        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        
        x.next = y;
        y.next = c;

        printList(a);
        printList(x);

        Node res = inter(a, x);
        System.out.println(res == null ? "No intersection" : "Intersection at: " + res.val);
        
    }
}