Algorithm Analysis Project

Project Overview

This project compares three algorithms: Insertion Sort, Heap Sort, and Binary
Search. The goal is to see how they perform with different array sizes and data
types.

Algorithm Descriptions

Insertion Sort: It takes one element at a time and places it in the correct
position. Complexity is O(n²). Heap Sort: It builds a max-heap and repeatedly
swaps the root with the last element. Complexity is O(n log n). Binary Search:
It splits the sorted array in half to find a target. Complexity is O(log n).

Experimental Results

| Size | Dataset | Insertion Sort (ns) | Heap Sort (ns) | Binary Search (ns) |
| :--- | :------ | :------------------ | :------------- | :----------------- |
| 10   | Random  | 4600                | 7700           | 1800               |
| 10   | Sorted  | 700                 | 3300           | 500                |
| 100  | Random  | 45600               | 49500          | 700                |
| 100  | Sorted  | 2800                | 80700          | 600                |
| 1000 | Random  | 1910200             | 177800         | 2200               |

Analysis

Heap Sort is much faster on the 1000-element array. Insertion Sort is very slow
when the data is random because it has to do many shifts. As the input size
grows, the time for Insertion Sort increases quadratically, while Heap Sort
stays more stable.

Sorted data makes a big difference for Insertion Sort, it becomes very fast
(only 700 ns for size 10). This matches the theoretical Big-O complexity where
Insertion Sort is linear for already sorted arrays.

Binary Search is the most efficient for finding values. It requires a sorted
array because the algorithm needs to know whether the target is in the left or
right half based on a comparison with the middle element. Without sorting, we
cannot skip halves of the array.

Reflection

I learned that the choice of algorithm depends on the data. For small or already
sorted lists, simple algorithms can be fast. But for large random datasets,
advanced algorithms like Heap Sort are necessary. The hardest part was making
sure the array was sorted before running Binary Search to get accurate
measurements.












































## D. Screenshots
### Program Output:
![Execution Results](docs/screenshots/peta3qLjT9.png)

