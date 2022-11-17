# Top14Patterns

                                    Fast and Slow Pointers
The fast and slow pointers approach is also known as the hare and tortoise algorithm. It is a pointer algorithm that uses two pointers which move through the array or sequence or linked list at different speeds.

The fast and slow pointers approach is quite useful when dealing with cyclic linked lists or arrays.

By moving at different speeds (for example, in a cyclic linked list), the algorithm proves that the two pointers are bound to meet. The fast pointer should catch the slow pointer once both of the pointers are in a cyclic loop.

Fast and slow pointers can be used if you’re trying to determine if a linked list is a palindrome. You could also use this pattern instead of the two-pointer method if you have a single-linked list where you can’t move backwards.                   


                                    Some common problems with the fast and slow pointers pattern:

Linked list cycle
Palindrome linked list
Cycle in a circular array