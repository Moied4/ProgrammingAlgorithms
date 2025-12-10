package org.vanier.labs.lab11;

import java.util.Arrays;
import java.util.List;

/**Task 3: Consumer with Lambda
 *Use a Consumer lambda to print each element in a string list prefixed by "Item: ".
 *List list = Arrays.asList("A", "B", "C");
*/

public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("A", "B", "C");
        words.forEach(word -> System.out.println("Item:" + word));
       // words.forEach(System.out::println);
    }
}
