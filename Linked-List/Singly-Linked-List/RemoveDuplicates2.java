class RemoveDuplicates2 {
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

    
    public static Node remDup2(Node head) {
        Node dummy = new Node(-1);
        Node t = dummy;
        Node i = head;
        while(i != null){
            if(i.next == null || i.val != i.next.val){
                t.next =i;
                t=i;
                i = i.next;
            }else{
                Node j = i.next;
                while(j!=null && j.val == i.val){
                    j = j.next;
                }
                i=j;
            }
        }
        t.next=i;
        return dummy.next;
    }



    public static void main(String[] args) {
        RemoveDuplicates2.Node a = new RemoveDuplicates2.Node(10);
        RemoveDuplicates2.Node b = new RemoveDuplicates2.Node(20);
        RemoveDuplicates2.Node c = new RemoveDuplicates2.Node(20);
        RemoveDuplicates2.Node d = new RemoveDuplicates2.Node(30);
        RemoveDuplicates2.Node e = new RemoveDuplicates2.Node(30);
        RemoveDuplicates2.Node f = new RemoveDuplicates2.Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;   

        System.out.print("Before: ");
        RemoveDuplicates2.printList(a);

        a = RemoveDuplicates2.remDup2(a);

        System.out.print("After:  ");
        RemoveDuplicates2.printList(a);
    }
}