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


                                Some common problems with the merge-intervals pattern:
Intervals intersection
Maximum CPU load