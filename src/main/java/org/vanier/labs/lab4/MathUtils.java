package org.vanier.labs.lab4;

    /**
     * Utility class demonstrating method overloading.
     * All methods are static, no need to create an instance.
     */
    public class MathUtils {

        // Overloaded add method for integers
        public static int add(int a, int b) {
            return a + b;
        }

        // Overloaded add method for doubles
        public static double add(double a, double b) {
            return a + b;
        }

        // Overloaded findMax method for integer arrays
        public static int findMax(int[] numbers) {
            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) max = num;
            }
            return max;
        }

        // Overloaded findMax method for double arrays
        public static double findMax(double[] numbers) {
            double max = numbers[0];
            for (double num : numbers) {
                if (num > max) max = num;
            }
            return max;
        }
    }


