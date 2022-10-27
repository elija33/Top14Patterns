# Top14Patterns

                                    Merge Overlapping Intervals.
Given a set of time intervals in any order, merge all overlapping intervals into one and output the result which should have only mutually exclusive intervals.

                                    Example:
Input: Intervals = {{1, 4}, {2, 4}, {6, 8}, {9, 10}}
Output: {{1,4}, {6, 8}, {9, 10}}.
Therefore we will merge these two and return [1, 4], [6, 8], [9, 10].

Input: Intervals = {{6,8}, {1,9}, {2,4}, {4,7}}
Step One Output:  {{1,9},{2,7}}.
Output: {1,9}  ===> [1, 9].

                                Merge Overlapping Intervals Optimized Approach
The idea to solve this problem is, first sort the intervals according to the starting time. 
Once we have the sorted intervals, we can combine all intervals in a linear traversal. 
The idea is, in sorted array of intervals, if interval[i] doesn’t overlap with interval[i-1], then interval[i+1] cannot overlap with interval[i-1] because starting time of interval[i+1] must be greater than or equal to interval[i].


                                        Follow the steps mentioned below to implement the approach:
Sort the intervals based on the increasing order of starting time.
Push the first interval into a stack.

For each interval do the following:
    - If the current interval does not overlap with the top of the stack then, push the current interval into the stack.
    - If the current interval overlap with the top of the stack then, update the stack top with the ending time of the current interval.
The end stack contains the merged intervals. 