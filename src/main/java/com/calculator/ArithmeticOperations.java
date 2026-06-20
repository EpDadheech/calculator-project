package com.calculator;

/**
 * ArithmeticOperations class provides basic arithmetic operations
 * including addition and subtraction of integer values.
 * 
 * @author Bob AI Assistant
 * @version 1.0
 */
public class ArithmeticOperations {
    
    /**
     * Adds two integer values and returns the result.
     * 
     * @param a First integer value
     * @param b Second integer value
     * @return Sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts the second integer value from the first and returns the result.
     * 
     * @param a First integer value (minuend)
     * @param b Second integer value (subtrahend)
     * @return Difference of a and b (a - b)
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Main method for testing the ArithmeticOperations class.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        ArithmeticOperations operations = new ArithmeticOperations();
        
        // Test addition
        int sum = operations.add(10, 5);
        System.out.println("Addition: 10 + 5 = " + sum);
        
        // Test subtraction
        int difference = operations.subtract(10, 5);
        System.out.println("Subtraction: 10 - 5 = " + difference);
        
        // Additional test cases
        System.out.println("\nAdditional Test Cases:");
        System.out.println("Add(100, 50) = " + operations.add(100, 50));
        System.out.println("Subtract(100, 50) = " + operations.subtract(100, 50));
        System.out.println("Add(-10, 5) = " + operations.add(-10, 5));
        System.out.println("Subtract(-10, 5) = " + operations.subtract(-10, 5));
    }
}

// Made with Bob
