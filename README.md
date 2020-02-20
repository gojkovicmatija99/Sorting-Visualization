# Sorting visualization

A sorting algorithm is used to rearrange a given array or list elements according to a comparison operator on the elements.

# The algorithms

**Bubble Sort** is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

**Selection Sort** algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. 

**Insertion Sort** algorithm sorts the array by keeping information about the positing of the sorted  part. In every iteration it inserts the next element in the sorted part and shifts the array.

**Merge Sort** is a divide and conquer algorithm. It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.

**Quick Sort** is a divide and conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. 

**Heap sort** is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the maximum element and place the maximum element at the end. The heap is represented by the given array.

# Time and space complexity

| Algorithm | Best Time | Average Time | Worst Time | Worst Space
| ----- | ----- | ----- | ----- | ----- |
| Bubble Sort | Ω(n) | θ(n^2) | O(n^2) | O(1) |
| Selection Sort | Ω(n^2) | θ(n^2) | O(n^2) | O(1) |
| Insertion Sort | Ω(n) | θ(n^2) | O(n^2) | O(1) |
| Merge Sort | Ω(nlogn) | θ(nlogn) | O(nlogn) | O(n) |
| Quick Sort | Ω(nlogn) | θ(nlogn) | O(n^2) | O(logn) |
| Heap Sort | Ω(nlogn) | θ(nlogn) | O(nlogn) | O(1) |

![alt text](https://github.com/gojkovicmatija99/Sorting-Visualization/blob/master/Sorting%20Visualization/src/view/demo.PNG)
