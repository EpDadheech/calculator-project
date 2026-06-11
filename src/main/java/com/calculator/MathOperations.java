package com.calculator;

/**
 * MathOperations class provides basic mathematical operations
 * Created by Bob
 */
public class MathOperations {
    
    /**
     * Adds two integer numbers
     * @param num1 First number
     * @param num2 Second number
     * @return Sum of num1 and num2
     */
    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
    
    /**
     * Adds two double numbers
     * @param num1 First number
     * @param num2 Second number
     * @return Sum of num1 and num2
     */
    public double addTwoNumbers(double num1, double num2) {
        return num1 + num2;
    }
    
    /**
     * Main method to demonstrate the addition methods
     */
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        // Test with integers
        int intResult = math.addTwoNumbers(10, 20);
        System.out.println("Addition of 10 + 20 = " + intResult);
        
        // Test with doubles
        double doubleResult = math.addTwoNumbers(15.5, 24.3);
        System.out.println("Addition of 15.5 + 24.3 = " + doubleResult);
    }
}

// Made with Bob
