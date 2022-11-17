# Top14Patterns
                                                        Two Heaps.

The two-heaps pattern is an efficient approach when you need to know the smallest element in one part and the biggest element in the other part. The pattern might be common, as in many problems, you are given a set of elements, which can be divisible into two parts.

You use a min heap to find the smallest element and a max heap to find the biggest element. The pattern stores the first half of the numbers in a max heap because you want to find the largest number in the first group. You then store the second half of numbers in a min heap, as you want to find the smallest number in the second half. You can calculate the median of the current list of numbers from the top element of the two heaps.

How to identify the two heaps pattern
The two heaps pattern is useful in priority queue and scheduling situations. If you need to find the smallest, largest or median elements of a set or solve a problem with a binary tree data structure, you can use the two heaps pattern.


                                        Some common problems featuring the two heaps pattern:
Find the median of a number stream  
Find min and max values among all maximum leaf nodes from all possible Binary Max Heap
Longest subarray with absolute difference between elements less than or equal to K using Heaps.
Difference between Heaps and Sorted Array
Insertion and Deletion in Heaps
Partition a set into two sebsets such that difference between max of one and min of other is minimized
Minimize sum of max sized subsequence such that no two element are adjacent.
Merge two sorted arrays in constant space using Min Heap
Merge two sorted arrays in 0(1) extra space using Heap.
Merge first two minimum elements of the array until all the elements are greater than k.                         