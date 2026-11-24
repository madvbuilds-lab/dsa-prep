class RemoveDuplicates {
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

    
    public static Node remDup(Node head) {
        if (head == null) return null;
        Node i = head, j = head;
        while (j != null) {
            if (i.val == j.val) {
                j = j.next;
            } else {
                i.next = j;
                i = j;
            }
        }
        i.next = null; 
        return head;
    }



    public static void main(String[] args) {
        RemoveDuplicates.Node a = new RemoveDuplicates.Node(10);
        RemoveDuplicates.Node b = new RemoveDuplicates.Node(10);
        RemoveDuplicates.Node c = new RemoveDuplicates.Node(20);
        RemoveDuplicates.Node d = new RemoveDuplicates.Node(20);
        RemoveDuplicates.Node e = new RemoveDuplicates.Node(30);
        RemoveDuplicates.Node f = new RemoveDuplicates.Node(30);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;   

        System.out.print("Before: ");
        RemoveDuplicates.printList(a);

        a = RemoveDuplicates.remDup(a);

        System.out.print("After:  ");
        RemoveDuplicates.printList(a);
    }
}
