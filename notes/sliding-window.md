# Sliding Window — Pattern Notes

**When to use:** contiguous subarray/substring problems asking for a max/min/count
satisfying some condition (sum, length, distinct chars, etc).

**Two variants:**
- Fixed-size window: window length is given.
- Variable-size window: expand right pointer, shrink left pointer when a condition breaks.

**Common pitfalls:**
- Forgetting to shrink the window before recording the result.
- Off-by-one on window boundaries.

**Practice list:** (add problems here as you solve them)
