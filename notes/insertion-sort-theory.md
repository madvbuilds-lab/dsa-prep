# Insertion Sort
- Takes and element and place it in its  correct order
- eg:- {14,9,15,12,6,8,13}
 look at firstelement as array so its on correct place
 add 9 and ask if 9 at correct position no then swap 
- for 12 swap with first 15 and then 14
- for 6 right shifts every element and comes at first
- same for 8 and 13 swap till it gets  to its  correct  postition how to find correct position is by comparing and if the element is swapped till it is smaller then the comparing element.

Psuedo code:-
for(i=0 ; i<=n-1 ; i++){
    j = i ;
    while(j>0 && a[j-1]>a[j]){
        swap them 
    }
}

- Time Complexity:-
Worst case - O(n^2)
Best case - O(n)
