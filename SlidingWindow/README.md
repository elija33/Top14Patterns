# Top14Patterns
                            # Sliding Window
The sliding window pattern is used to perform a required operation on a specific window size of a given array or linked list, such as finding the longest subarray containing all 1s. Sliding windows start from the first element and keep shifting right by one element. Adjust the length of the window to meet the criteria in your coding interview. The window size can grow, shrink or stay constant.


How To Identify The Sliding Window Problem

You might be asked to find the longest or shortest substring, subarray or a certain value. Additionally, if the problem input is a linear data structure such as a linked list, array or string, chances are it is a sliding window problem.


                        Implementation of Sliding Window
Method 1: 

Find the size of window required.
Compute the result for 1st window.
Then use a loop to slide the window by 1, and keep computing the result window by window.

Method 2:

We compute the sum of first k elements out of n terms using a linear loop and store the sum in variable window_sum.
Then we will graze linearly over the array till it reaches the end and simultaneously keep track of maximum sum.
To get the current sum of block of k elements just subtract the first element from the previous block and add the last element of the current block.

                                    Some Common problems with the sliding window problem:
Maximum sum subarray of size “K”
Longest substring with “K” distinct characters
String anagrams 
Find the longest substring of a given string containing k distinct characters
Find all substrings of a string that are permutation of a given string
Longest substring of given string containing distinct characters
Find maximum length sequence of continuous ones (Using Sliding Window)
Find the maximum sequence of continuous 1’s that can be formed by replacing at-most k zeroes by ones
Find minimum sum subarray of given size k
Find subarray having given sum in given array of integers
Find the length of the smallest subarray whose sum of elements is greater than the given number
Find the count of distinct elements in every sub-array of size k
Print all sub-arrays of an array having distinct elements
Count the distinct absolute values in the sorted array
Find duplicates within given range k in an array                     