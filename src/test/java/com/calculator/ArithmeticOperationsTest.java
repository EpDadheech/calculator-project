package com.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for ArithmeticOperations class.
 * Tests addition and subtraction methods with various scenarios.
 * 
 * @author Bob AI Assistant
 * @version 1.0
 */
public class ArithmeticOperationsTest {
    
    private ArithmeticOperations operations;
    
    @BeforeEach
    public void setUp() {
        operations = new ArithmeticOperations();
    }
    
    // Addition Tests
    
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(15, operations.add(10, 5), "10 + 5 should equal 15");
    }
    
    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-15, operations.add(-10, -5), "-10 + (-5) should equal -15");
    }
    
    @Test
    public void testAddPositiveAndNegative() {
        assertEquals(5, operations.add(10, -5), "10 + (-5) should equal 5");
    }
    
    @Test
    public void testAddZero() {
        assertEquals(10, operations.add(10, 0), "10 + 0 should equal 10");
        assertEquals(0, operations.add(0, 0), "0 + 0 should equal 0");
    }
    
    @Test
    public void testAddLargeNumbers() {
        assertEquals(2000, operations.add(1000, 1000), "1000 + 1000 should equal 2000");
    }
    
    // Subtraction Tests
    
    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(5, operations.subtract(10, 5), "10 - 5 should equal 5");
    }
    
    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(-5, operations.subtract(-10, -5), "-10 - (-5) should equal -5");
    }
    
    @Test
    public void testSubtractPositiveAndNegative() {
        assertEquals(15, operations.subtract(10, -5), "10 - (-5) should equal 15");
    }
    
    @Test
    public void testSubtractZero() {
        assertEquals(10, operations.subtract(10, 0), "10 - 0 should equal 10");
        assertEquals(0, operations.subtract(0, 0), "0 - 0 should equal 0");
    }
    
    @Test
    public void testSubtractLargeNumbers() {
        assertEquals(0, operations.subtract(1000, 1000), "1000 - 1000 should equal 0");
    }
    
    @Test
    public void testSubtractResultNegative() {
        assertEquals(-5, operations.subtract(5, 10), "5 - 10 should equal -5");
    }
}

// Made with Bob
