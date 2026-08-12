# Quick Sort
Sorting done in ascending order naturally but with tweaks can be done descending too.
Steps to implement:-
- Take a pivot element from anywhere in the array.
- Our goal is to take the pivot element to its correct place. For this we have to take all the smaller element to the left and greater one to the right.
- We do this by using pointers low and high. we run a loop totraverse the array and if element is smaller than the pivot we swap it otherwise we do nothing.
- At last we swap the element next to pointer i with the element at the high pointer.
- We recursively do this for the array of smaller element and the array of larger elements.

Time Complexity here is: O(nlogn)
But its space complexity is better then merge sort its O(1).