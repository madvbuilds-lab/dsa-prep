class CreationOfNodes{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
    // Accessing the Value at a given index.
    public static int get(Node head , int idx ){
        Node temp = head ;
        for(int i = 1 ; i <= idx ; i++){
            temp =temp.next;
        }
        return temp.val;
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
        e.next = null;
        System.out.print(get(a,3));
    }
}