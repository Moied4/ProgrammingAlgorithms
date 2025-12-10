package org.vanier.labs.lab12;

/**
 * Task 1: Filter Even Numbers
 * Given a list of integers, use streams to collect only even numbers into a new list.
 *
 * List nums = Arrays.asList(1,2,3,4,5,6);
 * List evens= ;
 *
 * System.out.println(evens);
 */

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNums = numbers.stream().filter(n -> n % 2 == 0).toList();
                System.out.println("These are the even numbers in this list:" + evenNums);

    }
}
