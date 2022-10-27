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

                                        Method 2: 

The above solution requires O(n) extra space for the stack. We can avoid the use of extra space by doing merge operations in place. Below are detailed steps.

Follow the steps mentioned below to implement the approach:

Sort all intervals in increasing order of start time.
Traverse sorted intervals starting from the first interval, 
Do the following for every interval.
    - If the current interval is not the first interval and it overlaps with the previous interval, then merge it with the previous interval. Keep doing it while the interval overlaps with the previous one.         
    - Otherwise, Add the current interval to the output list of intervals.
