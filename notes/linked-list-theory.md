# LinkedList in DSA — Complete Java Guide
1. Why LinkedList Exists — The Motivation
- Arrays store elements in contiguous memory. This gives O(1) random access (arr[i] is just base_address + i * element_size), but it creates two structural problems:
 (a) Fixed/expensive resizing. A Java array's size is fixed at creation. ArrayList works around this by allocating a new, larger array and copying everything over when it's full — an O(n) operation that happens occasionally (amortized O(1) for add, but a real O(n) spike when it triggers).
 (b) Expensive insertion/deletion in the middle. Inserting at index i means shifting every element after i one slot to the right — O(n) per insertion.

- A linked list trades away O(1) random access to fix both problems:
 (a) No resizing — you allocate memory node-by-node as you go, so growth is O(1) per node, no copying.
 (b) O(1) insertion/deletion once you have a reference to the position — you just rewire a couple of pointers, no shifting.

- The cost: to reach the k-th element you must walk from the head, one node at a time — O(n) access. There is no arithmetic shortcut like base + i*size because nodes are scattered across heap memory, each one only knowing where the next one lives.

- Core trade-off to memorize:

Operation	                     Array / ArrayList	   Linked List
Access by index	                      O(1)	              O(n)
Search (unsorted)	                  O(n)	              O(n)
Insert/delete at known position 
(with reference to node)	          O(n) (shifting)	  O(1)
Insert/delete at head	              O(n)	              O(1)
Insert/delete at tail	              O(1) 
                                   amortized (ArrayList)	O(1) if                  tail       pointer maintained, else O(n)
Memory overhead	                      Low 	               High
Cache locality	                   Excellent (contiguous)	Poor (scattered heap allocations)
Memory allocation pattern	     One big block	        Many small                                             allocations, one per node

- modern CPUs prefetch contiguous memory, so array traversal is often faster in wall-clock time than linked-list traversal even though both are "O(n)". This is why ArrayList is Java's default general-purpose list and LinkedList is a specialized tool

2. The Node — Atomic Unit of a Linked List
- A linked list is not a built-in language primitive in the way an array is. It's a data structure you build out of objects that each hold:
 (a) Some data
 (b) A reference (pointer) to the next node (and, for doubly linked lists, the previous node too).

 In JAVA:
 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null; // explicit for clarity; Java defaults object refs to null anyway
    }
}

3. Types of Linked Lists
3.1 Singly Linked List (SLL)
- Each node points only forward, to the next node. Traversal is one-directional. This is the default/most common form and what most interview problems mean by "linked list" unless stated otherwise.
  head → [10|•] → [20|•] → [30|null]

3.2 Doubly Linked List (DLL)
- Each node has two pointers: next and prev. You can traverse in both directions, and deletion of a known node becomes O(1) without needing its predecessor (in an SLL, deleting a node requires the predecessor to rewire next; a DLL node already knows its predecessor via prev).

Code:
class DNode {
    int data;
    DNode next;
    DNode prev;
    DNode(int data) { this.data = data; }
}

  null ← [10|•|•] ⇄ [20|•|•] ⇄ [30|•|null]
head                              tail

3.3 Circular Linked List (CLL)
- The last node's next points back to the head instead of null. There is no natural "end" — you must track size or use a sentinel to know when you've looped around, or compare curr.next == head to detect the loop point during traversal.

  head → [10] → [20] → [30] ─┐
         ↑___________________|

- Useful for: round-robin scheduling, circular buffers, Josephus-problem-style problems, music/playlist "repeat" functionality.

3.4 Circular Doubly Linked List
- Combines both: next and prev pointers, and the list wraps around in both directions (tail.next == head and head.prev == tail). Most flexible, most bookkeeping.