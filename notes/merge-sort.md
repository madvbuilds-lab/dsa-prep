# Merge Sort
In all the previous sorting techniques takes O(n^2) but it has a better time complexity

Explanation:- Divide and merge 
eg:- {3,1,2,4,1,5,2,6,4}
length here is 9
divides them into {3,1,2,4,1}and{5,2,6,4}
now again divide {3,1,2},{4,1} and{5,2},{6,4}
it will go till each element separately and now we will start merging them back.while merging we sort  them ascending order.

after last merge they appear as {1,2,3},{1,4} now compare element by element and place in the array
 we have {1,1,2,3,4} , {2,4,5,6}
 compare element by element and place in a neww array 

Psuedo Code:-
eg:- {3,2,4,1,3}
      0 1 2 3 4

mergesort(arr, low , high)
{
    if(low >= high) return;
    mid = (low + high)/2
    mergesort(arr,low,mid);
    mergesort(arr,mid+1,high);
    merge(arr,low,mid,high);

}