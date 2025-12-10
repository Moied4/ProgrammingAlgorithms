

/**7. Conceptual Questions on ArrayList Performance:
 *Question 1: Explain in your own words why adding an element to the middle of an ArrayList can be less efficient than adding an element to the end of an ArrayList.
 *Question 2: When would you prefer using an ArrayList over a traditional Java array? Provide at least two scenarios.
 *
 * Question 1:
 * Adding an element to the middle of an ArrayList is less efficient than adding to the end
 * because it requires shifting all the elements that come after the insertion point one position
 * to the right to make space for the new element. This shifting takes additional time, especially
 * for large lists. In contrast, adding an element to the end usually takes constant time (O(1)),
 * unless the internal array needs to be resized.
 *
 * Question 2:
 * You would prefer using an ArrayList over a traditional Java array in the following scenarios:
 *
 * 1. When the number of elements is not fixed and can grow or shrink during runtime.
 *    ArrayLists automatically resize, while arrays have a fixed size once created.
 *
 * 2. When you need to frequently add, remove, or search elements using built-in methods
 *    like add(), remove(), contains(), indexOf(), etc. These utilities make ArrayLists
 *    more flexible and easier to work with than raw arrays.
 */
