# Selection Sort — Pattern Notes

**When to use:** we use selection sort when memory space is limited as space complexity is O(1) . 
- if we want to minimize the swaps as it makes at most n-1 swaps total .
- is we have small data sets 20 to 50 elements 
- 

**Two variants:**
- Standard selection sort : find minimum place at first
- Desceneding Selection sort : finding maximum instead of minimum
- Double ended selection sort : finding min and max in the same pass place min at start and max at last
- Stable selection sort : instead of swapping we are shifting .

**Common pitfalls:**
- Swapping in the inner loop instead of the outer loop.
- outer loop goes till n-2 and in inner loop starts from i+1.
- forgetting to reset minIdx = i .
- swapp always under a condition when minIdx != i .

**Practice list:** (add problems here as you solve them)
