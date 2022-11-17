# Top14Patterns
                            Breadth First Search
The only catch here is, that, unlike trees, graphs may contain cycles, so we may come to the same node again. To avoid processing a node more than once, we divide the vertices into two categories:

Visited and Not visited.

Implementation of BFS traversal:
Follow the below method to implement BFS traversal.

Declare a queue and insert the starting vertex.
Initialize a visited array and mark the starting vertex as visited.
Follow the below process till the queue becomes empty:
    - Remove the first vertex of the queue.
    - Mark that vertex as visited.
    - Insert all the unvisited neighbours of the vertex into the queue.

    