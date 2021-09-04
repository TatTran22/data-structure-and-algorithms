# Data Structure and Algorithms using Java

#### Quick note by [**Tat Tran**](https://github.com/TatTran22)

## I. Sort Algorithms 📈

### Overview 📖

- [Stable Sort vs Unstable Sort](#1-stable-sort-vs-unstable-sort)
- [Bubble Sort](#2-bubble-sort)
- [Selection Sort](#3-selection-sort)
- [Insertion Sort](#4-insertion-sort)
- [Shell Sort](#5-shell-sort)
- [Merge Sort](#6-merge-sort)
- [Quick Sort](#7-quick-sort)
- [Counting Sort](#8-counting-sort)

### 1. Stable Sort vs Unstable Sort

- A sorting algorithm is said to be stable if two objects with equal keys appear in the same order in sorted output as
  they appear in the input array to be sorted.

- Stable sorting algorithms preserve the relative order of equal elements, while unstable sorting algorithms don’t.

#### _Do we care for simple arrays like array of integers?_

- When equal elements are indistinguishable, such as with integers, or more generally, any data where the entire element
  is the key, stability is not an issue. Stability is also not an issue if all keys are different.

#### _Which sorting algorithms are stable?_

- Some Sorting Algorithms are stable by nature, such as [Bubble Sort](#2-bubble-sort)
  , [Insertion Sort](#4-insertion-sort),
  [Merge Sort](#6-merge-sort), [Counting Sort](#8-counting-sort) etc.

#### _Which sorting algorithms are unstable?_

- [Quick Sort](#7-quick-sort), Heap Sort etc., can be made stable by also taking the position of the elements into
  consideration. This change may be done in a way which does not compromise a lot on the performance and takes some
  extra space, possibly \theta(n).

#### _Can we make any sorting algorithm stable?_

- Any given sorting algo which is not stable can be modified to be stable. There can be sorting algo specific ways to
  make it stable, but in general, any comparison based sorting algorithm which is not stable by nature can be modified
  to be stable by changing the key comparison operation so that the comparison of two keys considers position as a
  factor for objects with equal keys.

### 2. [Bubble Sort](./src/learn/programming/sortAlgorithms/BubbleSort.java)

- In-place algorithm
- O(n^2) time complexity - quadratic
- It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
- Algorithm degrades quickly

### 3. [Selection Sort](./src/learn/programming/sortAlgorithms/SelectionSort.java)

- In-place algorithm
- O(n^2) time complexity - quadratic
- It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
- Doesn't require as much swapping as bubble sort
- Unstable algorithm

### 4. [Insertion Sort](./src/learn/programming/sortAlgorithms/InsertionSort.java)

- In-place algorithm
- O(n^2) time complexity - quadratic
- It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
- Stable algorithm

### 5. [Shell Sort](./src/learn/programming/sortAlgorithms/ShellSort.java)

- In-place algorithm
- Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n^2), but it can perform
  much better than that
- Doesn't require as much shifting as insertion sort, so it usually performs better
- Unstable algorithm

### 6. [Merge Sort](./src/learn/programming/sortAlgorithms/MergeSort.java)

- NOT an in-place algorithm
- O(nlogn) - base 2. We're repeatedly dividing the array in half during the splitting phase
- Stable algorithm

### 7. [Quick Sort](./src/learn/programming/sortAlgorithms/QuickSort.java)

- In-place algorithm
- 0(nlogn) - base 2. We're repeatedly partitioning the array into two halves
- Unstable algorithm

### 8. [Counting Sort](./src/learn/programming/sortAlgorithms/CountingSort.java)

- NOT an in-place algorithm
- O(n) - can achieve this because we're making assumptions about the data we're sorting
- If we want the sort to be stable, we have to do some extra steps
