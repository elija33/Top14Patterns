# Top14Patterns

                                    Cyclic Sort
The cyclic-sort pattern is used with arrays containing numbers in a given range. It iterates over the array one number at a time. If the current number you are iterating is not at the correct index, you swap it with the number at its correct index.

You could try placing the number in its correct index, but this will produce a complexity of O(n²), which is not optimal. Enter: The cyclic-sort pattern.


                                            Some common problems with a cyclic-sort pattern:

Find the missing number
Find the smallest missing positive number
find minimum swaps required to sort an array.

                                           
A worst case 0(n^2) sorting algorithm
Does minimum memory writes and can be useful for cases where memory write is costly
In place and not stable
Usrful to solve quetions like find minimum swaps required to sort an array.

                                    
                                    Implementation of Cycle Sort
Start form the bring of the array
    if the array elememt on the first index is biggent.
    check how many element is smaller than it. 
    count the numbers of element is smaller than it.
    swap the element by the position of the total number of the small element.

                                    Example.
Input:  40 30 20 10         
Output: 10 20 30 40
index:     0  1  2  3
eleement: [10,20,30,40]