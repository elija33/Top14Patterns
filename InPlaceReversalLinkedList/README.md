# Top14Patterns

You might be asked to reverse the links between a set of nodes of a linked list. Often, the constraint is that you need to do this in-place, using the existing node objects and without using extra memory. In-place reversal of a linked list is useful in these situations.

The in-place reveral of linked list pattern reverses one node at a time starting with one variable (current) pointing to the head of the linked list, and one variable (previous) pointing to the previous node that you processed. In a lock-step manner, you will reverse the current node by pointing it to the previous before moving on to the next node. Also, you will update the “previous” variable to consistently point to the previous node that you have processed.

                        Some common problems featuring the in-place reversal of linked list pattern:

Reverse a sublist
Reverse every K-element sublist