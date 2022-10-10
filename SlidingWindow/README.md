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

