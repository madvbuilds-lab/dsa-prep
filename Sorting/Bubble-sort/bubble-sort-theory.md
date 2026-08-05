# Bubble sort
Pushing the maximum element in the array to the last by adjacently swapping.

{13,46,25,52,20,9}
Working:-
- 13<46 sorted , 46<25 not correct so swap it ,46<52 sorted ,52<20 no so swap it, 52<9 no so maximum element 52 is at right most .
- again in the similar way compare and swap to fin second largest .
- then third largest and so on.
Implementation as code:-
first we go from 0 to n-1.
                 0 to n-2.
                 0 to n-3.
                 till i we have to go.

psuedo code:-
for(i=n-1 ; i>=1 ; i--){
    for(j=0 ; j<= i-1 ; j++){
        if(a[j] < a[j+1]){
            swap
        }
    }
}

- if you are accessing an element not present it wiil throw a runtime error
