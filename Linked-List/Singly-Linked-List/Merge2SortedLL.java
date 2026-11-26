class Merge2SortedLL {
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

    
    public static Node merge(Node head1 , Node head2) {
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy;
        
        while(i != null && j!=null){
            if(i.val < j.val){
                k.next =i;
                i = i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        return dummy.next;
    }



    public static void main(String[] args) {
        Merge2SortedLL.Node a = new Merge2SortedLL.Node(10);
        Merge2SortedLL.Node b = new Merge2SortedLL.Node(20);
        Merge2SortedLL.Node c = new Merge2SortedLL.Node(20);
        Merge2SortedLL.Node d = new Merge2SortedLL.Node(30);
        Merge2SortedLL.Node e = new Merge2SortedLL.Node(30);
        Merge2SortedLL.Node f = new Merge2SortedLL.Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;   

        System.out.print("Before: ");
        Merge2SortedLL.printList(a);

        Merge2SortedLL.Node g = new Merge2SortedLL.Node(10);
        Merge2SortedLL.Node h = new Merge2SortedLL.Node(20);
        Merge2SortedLL.Node i = new Merge2SortedLL.Node(20);
        Merge2SortedLL.Node j = new Merge2SortedLL.Node(30);
        Merge2SortedLL.Node k = new Merge2SortedLL.Node(30);
        Merge2SortedLL.Node l = new Merge2SortedLL.Node(40);

        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;
        k.next = l;   

        System.out.print("Before: ");
        Merge2SortedLL.printList(g);

        a = Merge2SortedLL.merge(a,g);

        System.out.print("After:  ");
        Merge2SortedLL.printList(a);
    }
}