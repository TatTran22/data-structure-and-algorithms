# Data Structure and Algorithms using Java

#### Quick note by [**Tat Tran**](https://github.com/TatTran22)

## 1. Sort Algorithms 📈

### Overview 📖

- [Stable Sort vs Unstable Sort](#stable-sort-vs-unstable-sort)
- [Bubble Sort](#bubble-sort)
- [Selection Sort](#selection-sort)
- [Insertion Sort](#insertion-sort)
- [Shell Sort](#shell-sort)
- [Merge Sort](#merge-sort)

### Stable Sort vs Unstable Sort

- A sorting algorithm is said to be stable if two objects with equal keys appear in the same order in sorted output as
  they appear in the input array to be sorted.

- Stable sorting algorithms preserve the relative order of equal elements, while unstable sorting algorithms don’t.

#### _Do we care for simple arrays like array of integers?_

- When equal elements are indistinguishable, such as with integers, or more generally, any data where the entire element
  is the key, stability is not an issue. Stability is also not an issue if all keys are different.

#### _Which sorting algorithms are stable?_

- Some Sorting Algorithms are stable by nature, such as [Bubble Sort](#bubble-sort), [Insertion Sort](#insertion-sort),
  Merge Sort, Count Sort etc.

#### _Which sorting algorithms are unstable?_

- Quick Sort, Heap Sort etc., can be made stable by also taking the position of the elements into consideration. This
  change may be done in a way which does not compromise a lot on the performance and takes some extra space, possibly
  \theta(n).

#### _Can we make any sorting algorithm stable?_

- Any given sorting algo which is not stable can be modified to be stable. There can be sorting algo specific ways to
  make it stable, but in general, any comparison based sorting algorithm which is not stable by nature can be modified
  to be stable by changing the key comparison operation so that the comparison of two keys considers position as a
  factor for objects with equal keys.

### Bubble Sort

- In-place algorithm
- O(n^2) time complexity - quadratic
- It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
- Algorithm degrades quickly

### Selection Sort

- In-place algorithm
- O(n^2) time complexity - quadratic
- It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
- Doesn't require as much swapping as bubble sort
- Unstable algorithm

### Insertion Sort

- In-place algorithm
- O(n^2) time complexity - quadratic
- It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
- Stable algorithm

### Shell Sort

- In-place algorithm
- Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n^2), but it can perform
  much better than that
- Doesn't require as much shifting as insertion sort, so it usually performs better
- Unstable algorithm

### Merge Sort

- NOT an in-place algorithm
- O(nlogn) - base 2. We're repeatedly dividing the array in half during the splitting phase
- Stable algorithm

### Quick Sort

- In-place algorithm
- 0(nlogn) - base 2. We're repeatedly partitioning the array into two halves
- Unstable algorithm

### Counting Sort

- NOT an in-place algorithm
- O(n) - can achieve this because we're making assumptions about the data we're sorting
- If we want the sort to be stable, we have to do some extra steps