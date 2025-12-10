

/**
 *6. Conceptual Questions on LinkedList Performance:
 *Question 1: Explain why removing an element from the middle of a LinkedList can be more efficient than removing an element from the middle of an ArrayList, assuming you already have a reference to the node to be removed. (If you don't have a direct reference, discuss the implications).
 *Question 2: When would you absolutely prefer using a LinkedList over an ArrayList? Provide at least two distinct scenarios where LinkedList shines.
 *Question 3: Describe the internal structure of a LinkedList and how it differs from the internal structure of an ArrayList. Use an analogy if it helps your explanation.
 */

//Question 1:
//Why is removing an element from the middle of a LinkedList potentially more efficient than from an ArrayList if you already have a reference to the node? What if you don't?

//With a direct reference (LinkedList):
//A LinkedList consists of nodes linked together by pointers (references). If you already have a direct reference to the node you want to remove, the removal is efficient — it just involves updating the next and previous pointers of the adjacent nodes to bypass the target node. This operation takes O(1) time because no shifting of other elements is needed.

        //In contrast, ArrayList removal requires shifting:
//An ArrayList stores elements in a contiguous array. Removing an element from the middle requires shifting all subsequent elements one position left to fill the gap, which is an O(n) operation.

//Without a direct reference:
//If you only have an index or need to find the element first, LinkedList removal becomes less efficient because you have to traverse from the head or tail to that position — an O(n) operation. Similarly, ArrayList access by index is O(1), so finding the element is faster, but removal still involves shifting.

//Question 2:
//When would you absolutely prefer using a LinkedList over an ArrayList? Provide at least two distinct scenarios where LinkedList shines.

//Scenario 1: Frequent Insertions/Removals at Beginning or Middle
//If your application frequently adds or removes elements at the start or in the middle of a list (especially when you already have node references), a LinkedList is preferable because it avoids shifting elements.

//Scenario 2: Implementing Queues or Deques
//When you need a double-ended queue (deque) where you add and remove elements efficiently at both ends, LinkedList shines due to its O(1) insertion and removal at both head and tail.

//Bonus Scenario:
//When memory fragmentation or resizing overhead of an ArrayList is a concern (though usually ArrayLists are more memory efficient for random access).

//Question 3:
//Describe the internal structure of a LinkedList and how it differs from an ArrayList. Use an analogy if it helps.

//LinkedList Structure:
//Think of a LinkedList like a chain of train cars connected by couplings. Each car (node) holds data and has links (pointers) to the previous and next car. To get to the 5th car, you start at the engine and move car by car until you arrive. Adding or removing a car only requires changing the couplings of neighboring cars, no shifting needed.

//ArrayList Structure:
//An ArrayList is like a long, straight row of boxes lined up on a shelf (contiguous array). You can quickly access the 5th box by jumping directly to it (index access is O(1)). But if you remove a box in the middle, all boxes after it must slide one spot left to fill the gap — this shifting takes time.

//Key difference:

//LinkedList: scattered nodes linked by references, good for dynamic insertions/removals but slow random access.

        //ArrayList: contiguous block of memory, fast random access but costly insertions/removals in the middle.