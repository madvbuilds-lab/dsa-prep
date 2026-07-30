# DSA Prep

Daily DSA practice, organized by pattern instead of by platform — solved and pushed directly from VS Code as part of placement prep.

## Progress

| Topic | Solved | Status |
|---|---|---|
| Arrays | 0 | 🟡 In progress |
| Two Pointer | 0 | 🟡 In progress |
| Sliding Window | 0 | ⬜ Not started |
| Binary Search | 0 | ⬜ Not started |
| Strings | 0 | ⬜ Not started |
| Hashmaps | 0 | ⬜ Not started |
| Dynamic Programming | 0 | ⬜ Not started |

*(Update this table as you go — it's the first thing a reviewer sees.)*

## Structure

Each folder holds one pattern. Each file is one problem, named descriptively:

```
arrays/two-sum.java
two-pointer/container-with-most-water.java
```

## File template

Every solution file should start with a short header:

```java
/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/
Approach: Single-pass hashmap storing complements seen so far.
Time: O(n)   Space: O(n)
*/
```

## Notes folder

`notes/` is for pattern-level writeups (e.g. `sliding-window.md` explaining when to use the pattern, common variants, pitfalls) — not code. This is what shows understanding, not just volume.

## Workflow

1. Solve the problem in VS Code.
2. Add the header comment.
3. `git add . && git commit -m "arrays: two sum"`
4. `git push`

Commit as you solve — a steady daily commit history is the point of this repo.
